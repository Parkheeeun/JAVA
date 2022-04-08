public class Car {

	private String carName;
	private CarKind carKind;
	
	public String getCarName() {
		return carName;
	}
	
	public CarKind getCarKind() {
		return carKind;
	}
	
	
	
	
	public Car() {
		
	}
	
	public Car(String carName, CarKind carKind) {
		this.carName=carName;
		this.carKind=carKind;
	}
	
	
	
	public void setCarName(String carName) {
		this.carName=carName;
		}
	
	public int getPrice() {
		int price=0;
		if(carKind==carKind.Avante) {
			
			price=100;
			
		}
		else if(carKind==carKind.Sonata) {
			price=200;
		}
		else if(carKind==carKind.Gv80) {
			price=500;
		}
		return price;
	}
	
	
	
	

	
}
