package day3;
//import java.util.Scanner;
public class Customer {
	private String name, email;
	private int age;
	
	void acceptData(String n,String e,int a)
	{
//		Scanner sc = new Scanner (System.in);
			name = n;
//			System.out.println("Enter your name: ");
//			n= sc.next();
			email = e;
//			System.out.println("Enter your email: ");
//			e= sc.next();
			age = a;
//			System.out.println("Enter your age: ");
//			a= sc.nextInt();
//			sc.close();
	}
	
	void acceptData()
	{
		name = "ram";
		email = "ram99@gmail.com";
		age = 60;
	}
	
	
	
	void displayData()
	{
		System.out.println("\nName:\t"+name+"\nEmail:\t"+email+"\nAge:\t"+age);
	}
}

