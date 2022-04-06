package Pkg.Team.Cars;

class BigEngine extends Engine {
	public BigEngine() {
		super();
	}
	
	public BigEngine(double engineCapacity,String engineName) {
		super(engineCapacity,engineName);
	}
	
	@Override
	public void explosion() {
		System.out.println("대형엔진폭발");
	}
}
