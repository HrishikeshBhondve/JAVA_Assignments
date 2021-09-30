package daytwo;
import java.util.Scanner;
public class StudGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int rn,arr[],total =0;
				String name;
				arr = new int[5];
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the Role number: ");
				rn = sc.nextInt();
				System.out.println("Enter Student name: ");
				name = sc.next();
				
				System.out.println("\nEnter marks of 5 Subjects: ");
				for(int i=0; i<5; i++)
				{
					arr[i]=sc.nextInt();
					total = total + arr[i];
				}
				System.out.println("\nStudent's Roll Number: "+rn);
				System.out.println("Student's Name: "+name);
				System.out.println("Total marks obtained: "+total);
				
				StudGrade obj = new StudGrade();
				float per = obj.percentage(total);
				obj.checkGrade(per);
				
				sc.close();
			}
			
			float percentage(int total)
			{
				float p = total/5;
				System.out.println("Percentage: "+p+" %");
				return p;
			}
			
			void checkGrade(float p)
			{
				if(p>75)
					System.out.println("\nGrade: A");
				else if(p<74 && p>60)
					System.out.println("\nGrade: B");
				else if(p<59)
					System.out.println("Grade: C");
			}
		

	}


