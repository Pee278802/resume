import java.util.*;
public class main {

	private static Scanner in;

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	

	printName();
	printAge();
	printGrade();
	printGPA();
	
	}
	
	public static void printName() {
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter your name: ");
			String name = input.next();
			System.out.println("Name :" + name);
			
	}
	
	public static void printAge() {
			Scanner input = new Scanner (System.in);
			
			System.out.print("enter your age: ");
			int age = input.nextInt();
			System.out.println("Age :" + age);
			
	}
	
	public static void printGrade() {
			Scanner input = new Scanner (System.in);
			
			System.out.print("enter Grade STIA1113: ");
			String str = input.next();
			char grade = str.charAt(1);
			System.out.println("Grade: " + grade);
			
	}
	
	public static void printGPA() {
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter GPA Semester 1: ");
			double num1 = input.nextDouble();
			System.out.print("Enter GPA Semester 2: ");
			double num2 = input.nextDouble();
			
			double sum = num1 + num2;
			double totalgpa = sum/2;
			System.out.println("CGPA for current semester is" + totalgpa);
			
		
	}
}
