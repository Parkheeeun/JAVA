package Pkg.Exec;

import Pkg.AirPlane.Corsair;
import Pkg.AirPlane.Mutal;
import Pkg.Trnasport.Overload;
import Pkg.Trnasport.ScienceVessel;
import Pkg.Units.Zelrot;
import Pkg.Units.Zergling;
import java.util.Arrays;
public class Exec {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Zergling zergling1=new Zergling();
		zergling1.name="첫번째저글링";
		Zergling zergling2=new Zergling();
		zergling2.name="두번째저글링";
		Zergling zergling3=new Zergling();
		zergling3.name="세번째저글링";
		Zergling zergling4=new Zergling();
		zergling4.name="네번째저글링";
		
		Zelrot zelrot1=new Zelrot();
		zelrot1.name="첫번째질럿";
		Zelrot zelrot2=new Zelrot();
		zelrot2.name="두번째질럿";
		
		Mutal mutal1=new Mutal();
		mutal1.name="첫번째뮤탈";
		Corsair corsair1=new Corsair();
		corsair1.name="첫번째커세어";
		
		Overload overload1=new Overload();
		overload1.name="첫번째오버로드";
		
		ScienceVessel vessel1=new ScienceVessel();
		vessel1.name="첫번째배슬";
		//zelrot1.attack(zergling1);
		//zelrot1.attack(mutal1);	
		//zergling1.attack(zelrot2);
		//mutal1.attack(zelrot1);
		//zergling1.attack(zelrot1);
		//corsair1.attack(mutal1);
		//corsair1.attack(zergling1);
		//vessel1.wizard(zergling1);
		
		overload1.pickup(zergling1);
		overload1.pickup(zergling1);
		overload1.pickup(zergling2);
		overload1.pickup(zergling3);
		
		
		/*
		 String[] arr = new String[]{"1", "2", "3"};
	        String stringToSearch = "3";
	        System.out.println(Arrays.asList(arr).contains(stringToSearch));*/
	}

}
