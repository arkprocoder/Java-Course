package arkprocoder;
import java.util.Scanner;

public class Javaa03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		String name = sc.next();
		System.out.println("Enter the Employee Age :");
		int age=sc.nextInt();
		System.out.println("Enter the Employee Salary: ");
		float salary = sc.nextFloat();
		System.out.println("Enter the Employee Number :");
		long number=sc.nextLong();
		System.out.println("Employee name is "+name);
		System.out.println("Employee age is "+age);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee number  is "+number);
		sc.close();
		System.out.println(name.getClass());
	
		String name1="Anees";
		System.out.println(name1.getClass());

	}

}
