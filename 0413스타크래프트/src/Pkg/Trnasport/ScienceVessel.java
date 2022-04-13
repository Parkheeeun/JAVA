package Pkg.Trnasport;

import Pkg.Commons.*;
public class ScienceVessel extends StarUnit {
	
	public ScienceVessel() {
		super();
		this.health=40;
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
	public void die() {
		System.out.println(name+"사망");
	}
	
	public void wizard(StarUnit victimUnit) {//마법을 사용한다.   Zerg유닛이라면 공격력 5의 효과
		if(victimUnit.getUnitKind()==UnitKind.Zerg) {
			victimUnit.setHealth(victimUnit.getHealth()-5);
			System.out.println(this.name+"이 "+victimUnit.name+"에게 마법사용");
			System.out.println(victimUnit.name+"의 현재체력:"+victimUnit.getHealth());
			if(victimUnit.getHealth()<=0) {
				victimUnit.die();
			}
		}
	}
	public void observe() {
		
	}
}
