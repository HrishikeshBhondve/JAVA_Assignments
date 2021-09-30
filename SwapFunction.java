package daytwo;
import java.util.Scanner;
public class SwapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[] = new int[2];
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first number: ");
				arr[0]= sc.nextInt();
				System.out.println("Enter second number: ");
				arr[1]= sc.nextInt();
				
				SwapFunction obj = new SwapFunction();
				
				
				System.out.println("\nBefore Swapping:");
				System.out.println("Number1="+arr[0]+"\tNumber2="+arr[1]);
				obj.swap(arr);
				System.out.println("\nAfter Swapping:");
				System.out.println("Number1="+arr[0]+"\tNumber2="+arr[1]);
				sc.close();
			}

			
			void swap(int arr[])
			{
				
				int temp;
				temp = arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}
	}
