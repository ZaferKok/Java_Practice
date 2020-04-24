package personalData;

public class PersonalRunner {

	public static void main(String[] args) {
		Person person1 = new Person("Zafer","Kok",21,04,1984,"121312");
		System.out.println(person1.getBirthday());
		person1.setFirstname("Tarýk");
		System.out.println(person1.getFirstname());
		System.out.println(person1.verifySSN("121312"));
	}

}
