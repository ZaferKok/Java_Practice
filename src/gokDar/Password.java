package gokDar;

public class Password {

	public static void main(String[] args) {
		//Password Validation
		//1. Write a return method that can verify if a password is valid or not.
		//
		//requirements:
		//
		// 1. Password MUST be at least have 6 characters and should not contain space
		//
		//2. PassWord should at least contain one upper case letter
		//
		//3. PassWord should at least contain one lowercase letter
		//
		//4. Password should at least contain one special characters
		//
		//5. Password should at least contain a digit

		//if all requirements above are met, the method returns true, otherwise returns  false

		String p = "Zk.1/2ui";
		
		String a = "!^$%&()=?_|}][{#";
		
		int up = 0;
		int low = 0;
		int spe = 0;
		int dig = 0;
		boolean flag = false;
		
		
		for(int i=0; i<p.length(); i++) {
			if (p.length()<6) {
				System.out.println("Password is too short!");
				break;
			}
			if (p.charAt(i)>='A' && p.charAt(i)<='Z') {
				up++;
			}
			if (p.charAt(i)>='a' && p.charAt(i)<='z') {
				low++;
			}
//			if (Integer.parseInt(""+p.charAt(i))>=0 && (Integer.parseInt(""+p.charAt(i))<=9)) {
//				dig++;
//			}
			if (a.contains(""+p.charAt(i))) {
				spe++;
			}
		}
		if (up>0 && low>0 && dig>0 ) {//&& spe>0
			flag = true;
			System.out.println(flag);
		}
		
	}	

}
