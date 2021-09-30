import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		
		System.out.print("\nPlease enter power : ");
		int power=sc.nextInt();
		
		System.out.print("\n "+n+"^"+power+" : "+Math.pow(n, power));
		sc.close();
	}

}
