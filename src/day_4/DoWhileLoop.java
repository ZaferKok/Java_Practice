package day_4;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		There is a lonely monkey in the island 
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island 
		Create following variables and find how many days 
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		       */
		
		boolean alive = true;
		int live = 1;
		int banana = 165;
		
		do {
			banana-=4; 
			if (banana<4) {
				alive = false;
			}else {
				live++;
				System.out.println("Today is day "+live+" and Monkey is alive");
			}
					
		}while(alive);
			System.out.println("Monkey lived " + live + " days");

		
		
		
		
//		int live = 0;
//		int food = 165;
//		
//		do {
//			food -=4;
//			live++;
//		}
//		while (food>=0);
//		System.out.println(live);
	
	}

}
