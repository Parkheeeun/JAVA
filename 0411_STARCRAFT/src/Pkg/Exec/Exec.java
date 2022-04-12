package Pkg.Exec;

import Pkg.Unit.*;
import Pkg.Common.*;
public class Exec {

	
	public static void main(String[] args) {
		
		
		Unit zergling1=new Zergling();
		zergling1.name="첫번째저글링";
		Unit zergling2=new Zergling();
		zergling2.name="두번째저글링";
		Unit zergling3=new Zergling();
		zergling3.name="세번째저글링";
		
		Unit zergling4=new Zergling();
		zergling4.name="네번째저글링";
		Unit Zelrot1=new Zelrot();
		Zelrot1.name="첫번째질럿";
		
		
		Airplane mutal1=new Mutal(3);
		mutal1.name="첫번째뮤탈";
		Airplane corsair1=new Corsair(3);
		corsair1.name="첫번째커세어";
		
		
		Transport overload1=new Overload();
		overload1.name="첫번째오버로드";
		Transport shuttle1=new Shuttle();
		shuttle1.name="첫번째셔틀";
		ScienceVessel vessel1= new ScienceVessel();
		vessel1.name="첫번째베슬";
		
		
		
		
		//zergling1.attack(zergling1,Zelrot1);
		//mutal1.shotGun(mutal1,Zelrot1);
		//corsair1.shotGun(corsair1,zergling1);
	
		overload1.pickup(overload1,zergling1);
		overload1.pickup(overload1,zergling2);
		overload1.pickup(overload1, zergling3);
		overload1.pickup(overload1, zergling4);
		

	}
}
