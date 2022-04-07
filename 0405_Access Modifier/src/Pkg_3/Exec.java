package Pkg_3;

import Pkg_1.*;
import Pkg_2.User;
public class Exec {

	public static void main(String[] args) {
		Car car=new Car("슈퍼카트");
		User user1=new User();
		
		user1.setCar(car);
		user1.car.printName();
	

	}

}
