package Pkg.Unit;


import Pkg.Common.IZerg;


//import java.util.ArrayList;
//import Pkg.Common.*;
public class Overload extends Transport implements IZerg{

	public int i=0;
	public Overload() {
		super();
		this.heath=40;
		this.pickupNum=2;
		//this.unitKind=UnitKind.Zerg;
	}
	@Override
	public void fly() { //날아간다.
		System.out.println(name+"이 날아갑니다.");
	}


	@Override
	 public void pickup(Object attackUnit,Object victimUnit) {
	    		 Unit[] victimUnits = new Unit[pickupNum];
	      if(victimUnit instanceof IZerg && victimUnit instanceof Unit) {
	    	 if(i<((Transport)attackUnit).pickupNum) {
	    	  victimUnits[i] = (Unit) victimUnit;
	          i++;
	          System.out.println(((Unit)victimUnit).name+"탑승");
	    	 }
	    	 else {
	    	 System.out.println("수송인원초과");
	    	 }
	      }

	   }
	

	 
	
	public void observe() { //상대방의숨은유닛을 볼수있다.
		System.out.println("스캔");
	}
	
}
