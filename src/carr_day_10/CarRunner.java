package carr_day_10;

public class CarRunner {
		
	public static void main(String[] args) {
	//reference type   		Object type	
		Car car1 	= 	new Honda();
		Car car2 	= 	new Toyota();
		Car car3 	= 	new Honda("Accord", 2020, 33000);
		Car car4 	= 	new Toyota("Corolla", 2015, 23000);	
	
		System.out.println("========Honda========");
		System.out.println(car3.carModel());
		System.out.println(car3.carMake());
		System.out.println(car3.carYear());
		System.out.println(car3.carPrice());
		System.out.println("========Honda========");
		System.out.println(car1.carModel());
		System.out.println(car1.carMake());
		System.out.println(car1.carYear());
		System.out.println(car1.carPrice());
		System.out.println("========Toyota========");
		System.out.println(car2.carMake());
		System.out.println(car2.carModel());
		System.out.println(car2.carYear());
		System.out.println(car2.carPrice());
		System.out.println("========Toyota========");
		System.out.println(car4.carMake());
		System.out.println(car4.carModel());
		System.out.println(car4.carYear());
		System.out.println(car4.carPrice());
	}
	
	
}
