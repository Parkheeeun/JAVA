package Pkg.Team.Cars;

public class AirEngine extends Engine{

	public AirEngine() {
		super();
	}
	
	public AirEngine(String engineName, int engineCap) {
		super(engineName, engineCap);
	}
	
	@Override
	public void explosion() {
		System.out.println("에어엔진폭발");
	}
}
