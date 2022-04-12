package Pkg.Unit;

public abstract class Unit {

	//1.속성
	protected int offense; //공격력
	protected int heath; //체력
	protected int grade=0; //업그레이드 상태
	public String name;
	protected UnitKind unitKind;
	
	//2.생성자
	public Unit() {
		this.grade=0;
	
		
	}
	public Unit(int offense, int heath, int grade) {
		this.offense=offense;
		this.heath=heath;
		this.grade=0;
	}
	
	//3.메서드
	public abstract void attack(Object attackUnit, Object victimUnit);
	public abstract void upgrade();
	public abstract void die(Unit dieUnit);
	
	
	
}
