package day3;
public class VarArg {

	public static void main(String[] args) {
		VarArg obj = new VarArg();
		int result = obj.test(10,20,30,40,50);
		System.out.println("Sum of Arguements: "+result);

	}
	
	int test(int...a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

}