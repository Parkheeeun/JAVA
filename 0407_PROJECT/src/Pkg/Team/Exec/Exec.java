package Pkg.Team.Exec;

import Pkg.Team.Users.*;
import Pkg.Team.Cars.*;
//import Pkg.Commons.*;
public class Exec {

	public static void main(String[] args) {
		
		Warrior w1=new Warrior("전사",30);
		
		AirCar a1=new AirCar("뱅기자동차");
		
		w1.rideCar(a1);
		
		//Carpet carpet=new Carpet("요술카펫");
		Carpet carpet=new Carpet("요술카펫");
		//Chair Chair new Chair();
		
		w1.rideFlying(carpet);

	}

}
