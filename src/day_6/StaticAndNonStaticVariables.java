package day_6;

public class StaticAndNonStaticVariables {
	
	int number; 		// instance variable what is its default value?
	static int number2; // instance variable it is shared and you 
						// can call static variables with className
	
	public static void main(String[] args) {
	StaticAndNonStaticVariables obj1 = new StaticAndNonStaticVariables();
	obj1.number = 15;
	obj1.number2 = 15;
	
	System.out.println(obj1.number);
	System.out.println(obj1.number2);
	
	StaticAndNonStaticVariables obj2 = new StaticAndNonStaticVariables();
	obj2.number += 15;
	obj2.number2 += 15;
	
	System.out.println(obj2.number);
	System.out.println(obj2.number2);
	
	
	}

}
