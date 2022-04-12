package Pkg.Unit;

import Pkg.Common.*;
public abstract class Airplane implements IZerg{


		protected int offense;
		protected int heath;
		public String name;
		protected UnitKind unitKind;
		
		
		
		public Airplane() {
			
		}
		
		
		public abstract void fly();
		public abstract void shotGun(Object attack, Object victim);
		public abstract void fall(Object fallUnit);
	
}
