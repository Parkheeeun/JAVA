package Pkg.Unit;

public class ScienceVessel{

	private int heath;
	public String name;
	protected UnitKind unitKind;
	
	public ScienceVessel() {
		this.heath=30;
		this.unitKind=UnitKind.Protoss;
	}
	
	public void fly() { //날아간다.
		System.out.println(this.name+"이 날아갑니다.");
	}
	public void ovserve() { //상대방 숨은 유닛을 볼수 있다.
		System.out.println("스캔");
	}
	
	public void wizard(ScienceVessel vessel, Transport victimUnit) { //마법을 사용한다. zerg유닛을 공격하면 공격력 5의 효과
		if(victimUnit.unitKind==UnitKind.Zerg) {
			victimUnit.heath=victimUnit.heath-5;
			System.out.println(vessel.name+"이마법사용 "+victimUnit.name+"의 체력"+victimUnit.heath+"감소");
		}
	}
}
