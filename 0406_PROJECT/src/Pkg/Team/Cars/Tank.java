package Pkg.Team.Cars;

public class Tank extends Car{

	//1.속성
	private int maxBulletCnt; //최대총알개수
	
	public int getMaxBulletCnt() {
		return maxBulletCnt;
	}

	//2.생성자
	public Tank() {
		super();
	}
	
	public Tank(String carName, int maxSpeed) {
		super(carName,maxSpeed);
	}
	
	public Tank(String carName, int maxSpeed, int maxBulletCnt) {
		super(carName,maxSpeed);
		this.maxBulletCnt=maxBulletCnt;
	}
	
	//3.메서드(행위)
	//추상클래스를 상속받으면 반드시 추상메서드,추상속성을 재정의해야한다.
	public void ShotGun() { //대포를 쏜다.
		
		
	}
	
	@Override
	public void carRun() {
		System.out.println(this.getCarName()+"가 달린다.");
	}
	
	@Override
	public void speedUp() {
		System.out.println("탱크는 속도가 너무 늦게 올라가요.");
	}
	
	@Override
	public void fixEngine() { //대형엔진탑재
		BigEngine bEngine=new BigEngine();
		this.setCarEngine(bEngine);
	}
	
}
