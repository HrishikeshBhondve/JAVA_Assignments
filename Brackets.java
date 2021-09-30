package assig1;
import java.util.*;
import java.util.Stack;

public class Brackets {
	Stack stack=new Stack();
	public  boolean matchBrackets(char a,char b) {
		if((a=='{') && (b=='}') || (a=='(') && (b==')') || (a=='[') && (b==']'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
public boolean balanced (String s)
{
	for(int i=0;i<=s.length();i++)
	{
		try {
			if((s.charAt(i)=='{') || (s.charAt(i)=='(') || (s.charAt(i)=='['))
			{
				stack.push(s.charAt(i));
			}
			else if(stack.isEmpty())
			{
				return false;
			}
			else if(matchBrackets((char) stack.peek(),s.charAt(i)))
			{
				stack.pop();
			}
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	if(!stack.isEmpty())
	{
		return false;
	}
	return true;
}
}
