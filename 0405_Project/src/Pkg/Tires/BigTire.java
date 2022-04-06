package Pkg.Tires;

public class BigTire extends Tire{
	//2.생성자
		public BigTire() {
			super();
		}
		
		public BigTire(String tireName, String tireBrand, int tireSize) {
			super(tireName, tireBrand, tireSize);
		}
		
		//3.메서드(행위)
		@Override //재정의
		public void tirePuncture() {
			System.out.println(this.tireName+"가 펑크가났어요.(근데 소리가 크다)");
		}
}
