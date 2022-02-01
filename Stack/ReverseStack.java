/*
	input 12345   5 is topelement
	output 12345
*/

import java.util.Stack;
class ReverseStack
{
	public static void reverseStack(Stack<Integer> input,Stack<Integer> helpStack)
	{
		reverse(input,helpStack);

		while(!helpStack.isEmpty())
		{
			input.push(helpStack.pop());
		}

		while (!input.isEmpty()) 
		{
			System.out.print(input.pop()+" ");	
		}
	}

	public static void reverse(Stack<Integer>input,Stack<Integer> helpStack)
	{
		if(input.isEmpty())
		{
			return;
		}

		Integer temp=input.pop();
		reverse(input,helpStack);

		helpStack.push(temp);
	}	

	public static void main(String[] args) 
	{
		Stack<Integer> input=new Stack<>();
		Stack<Integer> helpStack=new Stack<>();
		int arr[]={1,2,3,4,5};
		for(int i:arr)
		{
			input.push(i);
		}
		
		reverseStack(input,helpStack);
	}
}