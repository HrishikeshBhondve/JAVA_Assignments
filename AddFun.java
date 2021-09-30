package daytwo;
import java.util.Scanner;
public class AddFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int a=31,b=26,c=19;
				float f=1.9f;
				double d= 54.44;
				Scanner sc = new Scanner(System.in);
				
				AddFun obj = new AddFun();
				obj.add(a, b);
				obj.add(c, f);
				obj.add(d, c);
				obj.add(a, b, c);
				sc.close(); 
				
			}
			
			public static void add(int x, int y)
			{
				int result=x+y;
				System.out.println("Addition: "+result);
			}
			
			public static void add(int x, float ff)
			{
				float result=x+ff;
				System.out.println("Addition: "+result);
			}
			
			public static void add(double d, int x)
			{
				double result=x+d;
				System.out.println("Addition: "+result);
			}
			
			public static void add(int x, int y, int z)
			{
				int result=x+y+z;
				System.out.println("Addition: "+result);
			}
}
