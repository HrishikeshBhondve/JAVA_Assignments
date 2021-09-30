import java.util.Scanner;
public class Addnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println("\nAddition of Two Numbers: \n");
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		char ch1,ch2;
		System.out.println("\nEnter First Number: ");
		a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of Two Numbers are:  \n"+c);
		
		
		System.out.println("\nAddition of Two Characters are:  \n");
		System.out.println("Enter First Character: ");
		ch1=sc.next().charAt(0);
		System.out.println("Enter Second Character: ");
		ch2=sc.next().charAt(0);
		System.out.println("Addition of Characters is: \n"+ch1+ch2);
		

	}

}
