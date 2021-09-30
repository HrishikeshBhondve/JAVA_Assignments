import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Value of x and y:");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping: "+x+" "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping: "+x+" "+y);
		
		sc.close();

	}

}

