package Pkg.Trnasport;

import Pkg.Commons.IFly;
import Pkg.Commons.IPickup;
import Pkg.Commons.StarUnit;
import Pkg.Commons.UnitKind;
import Pkg.Units.Unit;

public class Shuttle extends Transport implements IFly, IPickup{

	
	public Shuttle() {
		super();
		this.health=30;
		this.pickupNum=8;
	}
	@Override
	public void die() {
		System.out.println(name+"사망");
	}
	@Override
	public void attacked(StarUnit attackUnit) {
		System.out.println(attackUnit.name+"의 현재공격력:"+attackUnit.getOffense()+"  "+this.name+"의 현재체력:"+this.health);
		System.out.println(attackUnit.name+"이"+this.name+"을 공격");
		this.health=this.health-attackUnit.getOffense();
		System.out.println(this.name+"의 현재체력:"+this.health);
		if(this.health<=0) {
			this.die();
		}
	}
	@Override
	public void fly() {
		System.out.println(name+"가 날아다닙니다.");
	}
	
	public int i=0;
	@Override
	public void pickup(StarUnit victimUnit) {
		StarUnit[] victimUnits = new StarUnit[pickupNum];
		 if(victimUnit.getUnitKind()==UnitKind.Protoss && victimUnit instanceof IFly==false) {
	    	 if(i<this.pickupNum) {
	    	  victimUnits[i] = victimUnit;
	          i++;
	          System.out.println(victimUnit.name+"탑승");
	    	 }
	    	 else {
	    	 System.out.println("수송인원초과");
	    	 }
	      }
		 else {
			 System.out.println("프로토스유닛과 지상유닛만 탑승할수있습니다.");
		 }
	}
}
