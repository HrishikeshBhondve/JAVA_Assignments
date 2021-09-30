package daytwo;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		double sal;
		float hra,da;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee salary: ");
		sal = sc.nextDouble();
		
		if(sal<=10000)
		{
			hra=0.20f;
			da=0.80f;
		}
		else if(sal>10000 && sal<=20000)
		{
			hra=0.25f;
			da=0.90f;
		}
		else
		{
			hra=0.30f;
			da=0.95f;
		}
		Salary obj = new Salary();
		obj.calculateGrossIn(sal, hra, da);
		
		sc.close();
	}
	
	void calculateGrossIn(double sal,float hra, float da)
	{
		double gi= sal + (sal*hra) + (sal*da);
		System.out.println(new DecimalFormat("\nGross Salary: 0.00").format(gi));
	}

}

