import java.util.Scanner;
public class ArmstrongPalindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: \n");
		int n,r,rev=0,m;
		n=sc.nextInt();
		m=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(m==rev)
			System.out.println("\nEntered Number is palindrome");
		else
			System.out.println("\nEntered Number is not palindrome");
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the number: \n");
		int n1,r1,m1,sum=0;
		n1=sc1.nextInt();
		m1=n1;
	
		while(n1>0)				
		{
			r1=n1%10;
			sum=sum+r1*r1*r1;
			n1=n1/10;
		}
		if(m1==sum)
			System.out.println("\nEntered Number is Armstromg");
		else
			System.out.println("\nEntered Number is not Armstrong");
	}

}
