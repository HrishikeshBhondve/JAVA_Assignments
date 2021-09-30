import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter first number : ");
		int a=sc.nextInt();
		System.out.print("\nPlease enter second number : ");
		int b=sc.nextInt();
		System.out.print("\nPlease enter third number : ");
		int c=sc.nextInt();
		
		if(a>=b)
			if(a>=c)
				System.out.print("\nGreatest number: "+a);
			else
				System.out.print("\nGreatest number: "+c);				
		else if(b>=a)
			if(b>=c)
				System.out.print("\nGreatest number: "+b);
			else
				System.out.print("\nGreatest number: "+c);
			
		sc.close();
	}

}
