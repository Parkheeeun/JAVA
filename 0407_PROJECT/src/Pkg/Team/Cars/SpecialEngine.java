package Pkg.Team.Cars;

public class SpecialEngine extends Engine{

	
	public SpecialEngine() {
		super();
	}
	
	public SpecialEngine(String engineName, int engineCap) {
		super(engineName,engineCap);
	}
	
	@Override
	public void explosion() {
		System.out.println("스페셜엔진폭발");
	}
}
