package Pkg.Team.Cars;

	public abstract class Car { //추상클래스
	
	//1.속성
	private String carName; //Car가 만들어지면 절대로 수정불가
	private int maxSpeed; //Car가 만들어지면 수정불가하게
	private int nowSpeed;
	private Engine carEngine;
	
	
	public int getNowSpeed() {
		return nowSpeed;
	}

	public void setNowSpeed(int nowSpeed) {
		this.nowSpeed = nowSpeed;
	}

	public String getCarName() {
		return carName;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	protected void setCarEngine(Engine carEngine) {
		this.carEngine=carEngine;
}

	
	
	//2.생성자
	//위의 2가지 속성값을 car클래스를 사용하는쪽에서 초기화할것이냐.
	//혹시 위의 속성중에 초기값을 미리 결정할것이냐
	
	public Car() {
		this.nowSpeed=0;
		this.carEngine=new SmallEngine(1000,"스몰엔진"); //엔진탑재
	}
	
	public Car(String carName, int maxSpeed) {
		this.carName=carName;
		this.maxSpeed=maxSpeed;
		this.carEngine=new SmallEngine(1000,"스몰엔진"); //엔진탑재
		this.nowSpeed=0;
	}
	
	//3.메서드(행위)
	public abstract void carRun(); //추상메서드
	public abstract void fixEngine(); //추상메서드
	
	public void speedUp() {
		System.out.println("속도가 올라갑니다.");
	}
	
	
}
