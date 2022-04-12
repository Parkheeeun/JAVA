
package Pkg.Unit;
import Pkg.Common.*;
public class Shuttle extends Transport implements IProtoss{

	
	public Shuttle() {
		this.heath=30;
		this.pickupNum=8;
		//this.unitKind=UnitKind.Protoss;
	}
	
	@Override
	public void fly() { //날아간다.
		System.out.println(name+"이 날아갑니다.");
	}
	
	@Override
	public void pickup(Object attackUnit,Object victimUnit ) { //유닛을 태운다.(프로토스의 지상유닛만 태운다.)
		if(attackUnit instanceof IProtoss && victimUnit instanceof Unit) {
			System.out.println(((Transport)attackUnit).name+"이"+((Transport)victimUnit).name+"을 태웠다.");
		}
		else {
			System.out.println("같은종족의 지상유닛만 태울수있습니다.");
		}
	}
}
