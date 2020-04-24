package java_practice_day_9;

public class MyClass {


		//Answer the following questions according to
//      the given code.
//      1) Which ones are instance variable?
//      2) Which ones are local variables?
//      3) What is the default value of num1?
//      4) Which lines give red underline?
//      5) How many lines give compile time error?
		
			static int num1;
			String name = "Ali";
			char c;
			
			
			
			
			
			public static void main(String[] args){
				add();
				MyClass myClass = new MyClass();
				myClass.product(5);
				System.out.println(myClass.name + myClass.num1);
			}
			public static void add(){
				num1++;
				int num2 = 6; // local variable
				char letter; // local variable
				System.out.println("Do addition");
				//System.out.println(letter); //you need to initialize the "char letter" before you use
			}
			public  void product(int num3){
				name = "Veli";
				//      num2++;
				System.out.println(num3 * num3);
			}
		}
//local variables needs to be initialize before you use
//instance variables does not need to be initialized before you use
//The purpose of constructor is to initialize the object
//of a class while the purpose of a method is to
//perform a task by executing java code.
//Constructors cannot be abstract, final, static and
//synchronised while methods can be.


	


