package daytwo;
import java.util.Scanner;
public class ArrayOp {

	public static void main(String[] args) {
		int n,arr[],i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		n= sc.nextInt();
		arr = new int[n];
		System.out.println("Enter "+n+" Array elements");
		for(i=0;i<n;i++)
		{
			arr[i]= sc.nextInt(); 
		}
		sc.close();
		System.out.print("\nYour array: ");
		for(i=0;i<n;i++)
		{
			System.out.print("  "+arr[i]);
		}
		System.out.println("");
		ArrayOp obj = new ArrayOp();
		int sum =obj.arrSum(arr,n);
		System.out.println("\nSum of all array elements is "+sum);
		int avg = obj.arrAverage(sum, n);
		System.out.println("\nAverage of all array elements is "+avg);
		int max = obj.findMax(arr, n);
		System.out.println("\nMaximum value in the array is "+max);
		int min = obj.findMin(arr, n);
		System.out.println("\nMinimum value in the array is "+min);
		sc.close();
	}
	
	int arrSum(int a[], int n)
	{
		int sum=0,i;
		for(i=0;i<n;i++)
		{
			sum+= a[i];
		}
		return sum;
	}
	
	int arrAverage(int sum, int x) 
	{
		int avg = sum/ x;
		return avg;
	}
	
	int findMin(int a[],int n)
	{
		int min=a[0],i;
		for(i=0; i<n; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	int findMax(int a[], int n)
	{
		int max=0,i;
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}

}



