import java.util.*;
/*
	stack using Collection freamwork
*/
class StackUsingCollection
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		System.out.println(stack.size());
		System.out.println(stack.peek());  //return top element
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());		
	}	
}