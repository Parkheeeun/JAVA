package Pkg.Unit;
import Pkg.Common.*;
public class Zelrot extends Unit implements IProtoss{

	
	
	public Zelrot() {
		super();
		this.offense=3;
		this.heath=20;
		//this.unitKind=UnitKind.Protoss;
	}
	
	
	
	
	
	@Override 
	public void attack(Object attackUnit, Object victimUnit) { //공격할때마다 상대방 체력을 3씩 떨어뜨린다. 공중유닛은 지상유닛을 공격할수있지만 지상유닛은 공중유닛을 공격할수없다.
		
		if(attackUnit instanceof IProtoss && attackUnit instanceof Unit) {
			((Unit)victimUnit).heath=((Unit)victimUnit).heath-((Unit)attackUnit).offense;
			System.out.println(((Unit)attackUnit).name+"이 "+((Unit)victimUnit).name+"을 공격");
			System.out.println(((Unit)attackUnit).name+"의 남은체력:"+((Unit)attackUnit).heath);
			System.out.println(((Unit)victimUnit).name+"의 남은체력:"+((Unit)victimUnit).heath);
				if(this.heath<=0) {
					((Unit)victimUnit).die((Unit)victimUnit);
				}
	
		}
		else {
			System.out.println("공격실패(같은유닛은 공격할수없습니다.)");
		
		}
	}
	
	@Override
	public void upgrade() { //업그레이드하면 공격력이 1 향상된다.
		this.offense+=1;
		System.out.println("공격력 +1 현재공격력:"+this.offense);
	}
	@Override
	public void die(Unit dieUnit) { //체력값이 0이하가 되면 실행
		
			System.out.println(dieUnit.name+"사망");
		
	}
	
	public void walk() { //걸어다닌다.
		System.out.println("걸어다닙니다.");
	}
}
