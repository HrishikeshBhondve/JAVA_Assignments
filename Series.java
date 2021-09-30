import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();

		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.print("\nAddition from 1 to "+n+" : "+sum);
		sc.close();
	}

}
