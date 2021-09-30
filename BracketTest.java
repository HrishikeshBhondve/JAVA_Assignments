package assig1;

public class BracketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brackets b=new Brackets();
		String str="{([])}";
		if(b.balanced(str))
		{
			System.out.println("Brackets Matched");
		}
		else {
			System.out.println("Brackets Not Matched");
		}
			
	}

}
