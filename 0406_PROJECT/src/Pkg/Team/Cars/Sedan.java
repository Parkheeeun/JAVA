package Pkg.Team.Cars;

public class Sedan extends Car{

	//2.생성자
	public Sedan() {
		super();
	}
	
	public Sedan(String carName, int maxSpeed) {
		super(carName,maxSpeed);
	}
	
	//추상클래스를 상속받으면 반드시 추상메서드,추상속성을 재정의해야한다.
	//3.메서드(행위)
	@Override
	public void carRun() {
		System.out.println(this.getCarName()+"가 달린다.");
	}
	
	@Override
	public void fixEngine() { //소형엔진탑재
		SmallEngine sEngine=new SmallEngine();
		this.setCarEngine(sEngine);
	}
}
