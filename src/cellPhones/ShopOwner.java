package cellPhones;
import java.util.Scanner;
public class ShopOwner {
	
	 protected static CellPhones iphone;
	 protected static CellPhones samsung;
	 protected static CellPhones xiaomi;
    // CellPhones phone0 = new IPhone("6S",16,320);  
	public static void main(String[] args) {
		iphone = new IPhone();
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Phone number:");
		System.out.println("1-Iphone");
		System.out.println("2-Samsung");
		System.out.println("3-Xiaomi");
		int option = scan.nextInt();
		System.out.println("Enter model : ");
		String modelName = scan.next();
		System.out.println("Enter storage : ");
		int storage = scan.nextInt();
		System.out.println("Enter price : ");
		double price = scan.nextDouble();
		System.out.println(iphone.phoneModel());
		System.out.println(iphone.phoneStorage());
		System.out.println(iphone.phonePrice());
		switchOptions(option,modelName,storage,price);
		System.out.println(iphone.phoneModel());
		System.out.println(iphone.phoneStorage());
		System.out.println(iphone.phonePrice());
		
		IPhone ph1 = new IPhone();
	}
	public static void switchOptions
	(int option,String modelName, int storage, double price) {
		switch(option) {
		case 1: iphone = new IPhone(modelName,storage,price);
		break;
		case 2: samsung = new Samsung(modelName,storage,price);
		break;
		case 3: xiaomi = new Xiaomi(modelName,storage,price);
		break;
		}
		
	}
}
