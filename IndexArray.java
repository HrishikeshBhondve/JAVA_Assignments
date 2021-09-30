package daytwo;
import java.util.Scanner;
public class IndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int i,n, arr[];
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter array size: ");
					n = sc.nextInt();
					arr = new int[n];
					System.out.println("Enter "+n+" Array elements:");
					for(i=0; i<n; i++) 
					{
						arr[i]= sc.nextInt();
					}
					System.out.println("\nEnter the number which is in the array: ");
					int find = sc.nextInt();
					
					IndexArray obj = new IndexArray();
					
					int number = obj.findInd(arr, find);
					if(number==-1)
						System.out.println(find+" is not there in the array.");
					else
					System.out.println(find+" is at the index "+number);
					sc.close();
					
			}
			
			int findInd(int a[],int x)
			{
				int i=0;
				int len = a.length;
				while(i<len)
				{
					if(a[i]==x)
						return i;
					else
						i++;
				}
				return -1;
			}
}
