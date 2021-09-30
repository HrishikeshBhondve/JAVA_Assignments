import java.util.Scanner;
public class EvenOddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease enter a number : ");
		int n=sc.nextInt();
		
		int evensum=0,oddsum=0;
		for(int i=1;i<=n;i++)
			if(i%2==0)
				evensum+=i;
			else
				oddsum+=i;
		System.out.print("\nAddition of even numbers from 1 to "+n+" : "+evensum);
		System.out.print("\nAddition of odd numbers from 1 to "+n+" : "+oddsum);
		sc.close();
	}

}
