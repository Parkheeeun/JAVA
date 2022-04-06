package Pkg.Tires;

public class SmallTire extends Tire {

	
	//2.생성자
	public SmallTire() {
		super();
	}
	
	public SmallTire(String tireName, String tireBrand, int tireSize) {
		super(tireName, tireBrand, tireSize);
	}
	
	//3.메서드(행위)
	@Override //재정의
	public void tirePuncture() {
		System.out.println(this.tireName+"가 펑크가났어요.(근데 소리가 작다)");
	}
	
	public void checkProperty() {
		System.out.println("타이어이름:"+this.tireName);
		System.out.println("타이어브랜드:"+this.tireBrand);
		System.out.println("타이어사이즈:"+this.tireSize);
	}
}
