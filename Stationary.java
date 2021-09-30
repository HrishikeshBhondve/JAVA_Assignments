package daytwo;
import java.util.Scanner;
public class Stationary {

	public static void main(String[] args) {
		long total=0;
		int option=0;
		boolean b= false;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nStationary Shop?");
		System.out.println("1.Pen");
		System.out.println("2.Pencil");
		System.out.println("3.Notebook");
		System.out.println("4.Bottle");
		System.out.println("5.Colorox");
		System.out.println("6.Exit");
		System.out.println("");
		
		
		
		while(b!=true)
		{
			System.out.println("\nEnter Choice: ");
			option = sc.nextInt();
			switch(option)
			{
			    
				case 1:
					System.out.println("how many pens you want to buy? ");
					int pen = sc.nextInt();
					total += pen*10;
					break;
				case 2:
					System.out.println("how many Pencils you want to buy? ");
					int pencil = sc.nextInt();
					total += pencil*5;
					break;
				case 3:
					System.out.println("how many Notebooks you want to buy? ");
					int notebook = sc.nextInt();
					total += notebook*20;
					break;
				case 4:
					System.out.println("how many Bottles you want to buy? ");
					int bottle = sc.nextInt();
					total += bottle*30;
					break;
				case 5:
					System.out.println("how many Colorboxes you want to buy? ");
					int cb = sc.nextInt();
					total += cb*50;
					break;
				case 6:
					b=true;
					break;
				default:
					System.out.println("Enter Valid Option :)");
			}
			
		}
		
		if(total!=0)
		System.out.println("Total Shopping: Rs. "+total);
		System.out.println("Thank You. Have a nice day..");
		
	}

}
