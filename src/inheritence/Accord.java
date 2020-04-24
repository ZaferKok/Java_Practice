package inheritence;

public class Accord extends Honda{
	
	public void cost () {
		System.out.println("It costs around 30000$");
	}

	public void callinfNumOfSeats() {
		System.out.println(this.numOfSeats=5);
	}
	
	public static void main (String[] args) {
		
		Accord obj = new Accord();
		
		System.out.println(obj.brandName);
		System.out.println(obj.tires);
		obj.doors();
		obj.country();
		obj.cost();
		obj.callinfNumOfSeats();
				
	}
}
