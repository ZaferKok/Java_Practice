package carr_day_10;

public class Toyota extends Car{
	
	protected String make = "Toyota";
	protected String model = "Camry";
	protected int year = 2015;
	protected double price = 10000;
	
	public Toyota() {
		
	}
	
	public Toyota(String model, int year, double price) {
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
