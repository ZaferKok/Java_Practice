package hrnEkc;

public class StudentTest {
	
	    public static void main(String[] args) {
	    
	        
	        Student student1= new Student();
	        student1.name="Mike";
	        student1.age=27;
	        
	        System.out.println(student1.age);
	        System.out.println(student1.name);
	        
	        System.out.println("************************");
	        
	        Student student2= new Student("Betül", 21);
	        
	        System.out.println(student2.name);
	        System.out.println(student2.age);
	        System.out.println(student2.gpa);
	        System.out.println("************************");   
	        
	        Student student3= new Student("John", 23,"M", 3.9, "Java", "UH");
	        System.out.println(student3.name);
	        System.out.println(student3.age);
	        System.out.println(student3.gpa);
	        System.out.println(student3.gender);
	        System.out.println(student3.course);
	        System.out.println(student3.university);
	        System.out.println("************************");   
	        student1.calculateGrade(85);
	        student1.calculateGrade("Muhammet", 65, 75, 70);
	        student2.calculateGrade(87, 95);
	        student3.calculateGrade("Serhat", 85, 95, 100);
	    }}	        
	        /* Method Overloading
	         * 
	         * Different methods with same name but different signatures
	         * compile time polimorphisim, easy to remember, readable and reusable,
	         * flexibility to call similar methods.
	         * 
	         */
	        
	        /* Difference between a Constructor and a Method?
	         * 
	         * Constructor does'nt have a return type and constructor's name must be a the class name
	         * Constructor is called automatically when a new object is created.
	         * The Java compiler provides a default constructor if we do not have any constructor.
	         * Constructors are not inherited by child classes.
	         * 
	         * Methods may have a return type and may not be
	         * the method's name may or may not be as the class name.
	         * Method is not provided by compiler in any cases.
	         * Methods are inherited by child classes.
	         */
	        
	        /*Difference between Public,Private,Protected and Default modifiers in Java
	         * public is accessible to anywhere
	         * private is only accessible in the same class which is declared
	         * default is accessible is only inside the same package
	         * protected is accessible inside the same package and also outside the package but only child classes.
	         * 
	         * we can not use private or protected modifier with a top level class.
	         * we should also keep in mind that access modifier can not applied for local variable public, private or protected in Java.
	         * 
	         * 
	         * */

