package Pkg.Team.Cars;

 class SmallEngine extends Engine {
	public SmallEngine() {
		super();
	}
	
	public SmallEngine(double engineCapacity,String engineName) {
		super(engineCapacity,engineName);
	}
	
	@Override
	public void explosion() {
		System.out.println("소형엔진폭발");
	}

}
