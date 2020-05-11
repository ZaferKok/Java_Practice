package hrnEkc;

public class Student {
	/*
	 * Step1:For the following objects create Student class template. Step2:Write
	 * your code for the Student class and another class to test it. Step3:This
	 * class has; name,age,gender(M/F),gpa,course(JS,Java,Phyton) and university
	 * Step4:Create 3 constructors with 0,2 and all parameters Step5:Write 3 methods
	 * as a name of "calculateGrade" with different paremeters and call them from
	 * your test class
	 */
	String name;
	int age;
	String gender;
	double gpa;
	String course;
	String university;

	// click righ-->source--> Generate constructor using fields
	public Student() {
		super();

		System.out.println("Constructor with zero parameter");
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;

		System.out.println("Constructor with two parameters");
	}

	public Student(String name, int age, String gender, double gpa, String course, String university) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.gpa = gpa;
		this.course = course;
		this.university = university;

		System.out.println("Constructor with all parameters");
	}

	public static void calculateGrade(int x) {
		System.out.println("Your first midterm result is= " + x);
	}

	public static void calculateGrade(int x, int y) {
		int midtermAvarage = (x + y) / 2;

		System.out.println("Your midterm avarage is = " + midtermAvarage);

	}

	public static void calculateGrade(String name, int x, int y, int z) {

		int avarage = (x + y + z) / 3;
		System.out.println("Student " + name + "'s general avarage is= " + avarage);
	}

}
