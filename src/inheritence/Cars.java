package inheritence;

public class Cars {

	String brandName;
	String tires;
	int numOfSeats;

	public Cars() {
		this.brandName = "Honda";
		this.tires = "Cars have 4 tires";
		
	}
	
	public Cars(int numOfSeats) {
		this.numOfSeats = numOfSeats;;
	}
	
	public void doors() {
		System.out.println("Cars have 4 doors");
	}



}
