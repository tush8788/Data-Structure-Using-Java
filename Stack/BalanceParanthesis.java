/*
	Balance parathesis
	input (()()())	output true
	input (()()()))	output false
*/
import java.util.Stack;

class BalanceParanthesis
{
	public static boolean balanceParanthisisUsingStack(String str)
	{
		Stack<Character> stack=new Stack<>();

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
			}
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					stack.pop();
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) 
	{
		String str="(()()()()))";
		System.out.print("parathises balance is: "+balanceParanthisisUsingStack(str));
	}	
}