package day_7_java_practice;

import java.util.Scanner;

public class ScrumRunner {

	public static void main(String[] args) {
		
		//create 2 String variables
        //userName , password
        //Then pass them to typeUsernamePassword method
//      LoginPage login = new LoginPage("Tester","tester12345");
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username and password");
        String userName = scan.next();
        String password = scan.next();
        LoginPage login = new LoginPage(userName,password);
		
 //       LoginPage login = new LoginPage();
 //       login.typeUsernamePassword("Tester", "tester12345");
        
        
//      login.typeUsernamePassword("Scrum_Master", "scrum12345");

		

		
	}
}
