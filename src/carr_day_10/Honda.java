package carr_day_10;

public class Honda extends Car {
	
	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	protected double price = 7000;
	
	public Honda() {
	}
	public Honda(String model, int year, double price) {	
		super(model, year, price);
		this.model = model;
		this.year = year;
		this.price = price;	
	}
	String carMake() {	
		return "Car make: "+make;
	}
	String carModel() {	
		return "Car model: "+model;
	}
	String carYear() {	
		return "Car year: "+year;
	}
	String carPrice() {	
		return "Car price: $"+price ;
	}

}
