package Pkg.Commons;

public abstract class StarUnit {

	protected int health;
	protected int offense;
	protected UnitKind unitKind;
	public String name;
	
	
	public int getOffense() {
		return this.offense;
	}
	public UnitKind getUnitKind() {
		return this.unitKind;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		this.health=health;
	}
	
	
	
	
	public StarUnit() {
		
	}
	
	public abstract void attacked(StarUnit attackUnit);
	public abstract void die();
}
