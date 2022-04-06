package Pkg.Team.Exec;

import Pkg.Team.Cars.*;
import Pkg.Team.Users.*;
public class Exec {

	public static void main(String[] args) {
		
		Sedan sedan1= new Sedan("소나타",220);
		User user1=new User("홍길동");
		user1.setCar(sedan1);
		(user1.getMyCar()).carRun();
		
		
		String sedanName=sedan1.getCarName();
		int sedanMaxSpeed=sedan1.getMaxSpeed();
		System.out.println(sedanMaxSpeed);
		
		sedan1.setMaxSpeed(400);
		int sedanMaxSpeed2=sedan1.getMaxSpeed();
		System.out.println(sedanMaxSpeed2);
		
	}

}
