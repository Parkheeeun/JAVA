package Pkg.AirPlane;

import Pkg.Commons.IAttack;
import Pkg.Commons.StarUnit;
import Pkg.Commons.UnitKind;
import Pkg.Units.*;

public class Corsair extends AirPlane implements IAttack{

	public Corsair() {
		super();
		this.unitKind=UnitKind.Protoss;
		this.health=40;
		this.offense=5;
	}
	public Corsair(int offense) {
		super();
		this.unitKind=UnitKind.Protoss;
		this.health=40;
		this.offense=offense;
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
		if(victimUnit.getUnitKind()==UnitKind.Zerg && victimUnit instanceof	 AirPlane) { //뮤탈일때 공격력2배
			this.offense=this.offense*2;
			victimUnit.attacked(this);
		}
		else if(victimUnit.getUnitKind()!=this.unitKind) { //같은종족공격불가
			victimUnit.attacked(this);
			}
		
			else {
				System.out.println("같은종족은 공격을할수없습니다.");
			}
		
	}
}
