package Pkg.Tires;

public class Tire {

	//1.속성
	public String tireName;
	public String tireBrand;
	public int tireSize;
	
	//2.생성자
	public Tire() {
		
	}
	
	public Tire(String tireName, String tireBrand, int tireSize) {
		this.tireName=tireName;
		this.tireBrand=tireBrand;
		this.tireSize=tireSize;
	}
	
	//3.메서드(행위)
	public void tirePuncture() {
		System.out.println(this.tireName+"가 펑크가났어요.");
	}
}
