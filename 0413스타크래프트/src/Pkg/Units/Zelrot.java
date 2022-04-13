package Pkg.Units;

import Pkg.Commons.IAttack;
import Pkg.Commons.StarUnit;
import Pkg.Commons.UnitKind;
import Pkg.AirPlane.*;

public class Zelrot extends Unit implements IAttack{

	
	public Zelrot() {
		super();
		this.offense=3;
		this.health=20;
		this.grade=0;
		this.unitKind=UnitKind.Protoss;
	}
	
	
	public void run() {
		System.out.println(name+"이 달린다.");
	}
	
	@Override
	public void upgrade() {
		this.offense=this.offense+5;
		System.out.println(this.name+"의 공격력증가(현재공격력:"+this.offense+")");
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
	public void attack(StarUnit victimUnit) {
		if(victimUnit instanceof AirPlane==false && victimUnit.getUnitKind()!=this.unitKind) { //같은종족,공중유닛 공격불가
		victimUnit.attacked(this);
		}
		else {
			System.out.println("같은종족과 공중유닛은 공격을할수없습니다.");
		}
	}
}
