package Pkg.Unit;



public abstract class Transport {

	protected int heath;
	protected int pickupNum;
	public String name;
	protected UnitKind unitKind;
	
	public abstract void fly(); //날아간다.
	public abstract void pickup(Object attackUnit,Object victimUnit); //유닛을 태운다.
}
