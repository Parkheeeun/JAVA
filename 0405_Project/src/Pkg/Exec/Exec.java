package Pkg.Exec;

import Pkg.Cars.*;
import Pkg.Tires.*;
import Pkg.Users.*;

public class Exec {

	public static void main(String[] args) {
		//차량 생성
		Sedan sedan1 =new Sedan("기아","K5");
		Sedan sedan2 =new Sedan("현대","소나타");
		Suv suv1=new Suv("기아","쏘렌토");
		Suv suv2=new Suv("제네시스","GV80");
		Tank tank1 =new Tank("탱크","탱크1");
		
		//타이어생성
		SmallTire sTire1=new SmallTire("sedan용타이어","넥센",12);
		SmallTire sTire2=new SmallTire("sedan용타이어","기아",13);
		BigTire bTire1=new BigTire("suv용타이어","한국",15);
		BigTire bTire2=new BigTire("suv용타이어","한화",15);
		SpecialTire spTire1=new SpecialTire("tank용타이어","한국",50);
		
		//차량에 타이어장착
		sedan1.setTire(sTire1);
		sedan1.setTire(sTire2);
		suv2.setTire(bTire1);
		suv2.setTire(bTire2);;
		tank1.setTire(spTire1);
		
		//유저만든후 차량구매
		User user1=new User("홍길동");
		user1.buyCar(sedan1);
		user1.buyCar(suv2);
		user1.buyCar(tank1);
		
		//유저1의 차량리스트보여주기
		user1.showCarList();

		//유저가 차량을 선택하여 탑승한거출력
		user1.pickCar(1);
		//유저가 차량을 하차한걸 출력
		user1.getOutCar();
		
		
		
		
		
	}

}
