package Pkg.Trnasport;


import Pkg.Commons.*;
import Pkg.Units.Unit;
import java.util.Arrays;
import java.sql.Connection;

public class Overload extends Transport implements IPickup,IFly{
	
	public Overload() {
		super();
		this.health=40;
		this.pickupNum=3;
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
	/*
	 * String[] arr = new String[]{"1", "2", "3"};
	        String stringToSearch = "3";
	        System.out.println(Arrays.asList(arr).contains(stringToSearch));
	        
	        !checkUnit(victimUnit)이면 같은유닛을태울수없다. 현재타고있는 유닛을확인해주는 메서드만들기(boolean)
	 */
	public int i=0;
	@Override
	public void pickup(StarUnit victimUnit) { //한번 태웠던유닛은 또탑승하면 안된다.
		StarUnit[] victimUnits = new StarUnit[pickupNum];
		 if(victimUnit.getUnitKind()==UnitKind.Zerg && victimUnit instanceof IFly==false) {
			
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
			
			 System.out.println("저그유닛과 지상유닛만 탑승할수있습니다.");
		 }
        
	}
	
	//현재타고있는 유닛을확인해주는 메서드만들기(boolean)
	private void checkUnit(Unit victimUnit) {
		
	}
	
	
	public void observe() {
		System.out.println("스캔");
	}
}
