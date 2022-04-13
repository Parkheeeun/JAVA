package Pkg.Units;

import Pkg.Commons.*;
public abstract class Unit extends StarUnit {

	
	protected int grade=0;
	
	public Unit() {
		
	}
	
	public abstract void upgrade();
}
