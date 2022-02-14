/*
	Stack implement using 2 Queue
*/

import java.util.*;

class StackUsingQueue
{
	Queue<Integer> q1;  //Queue is a interface in collection thatswhy use LinkedList for implementation
	Queue<Integer> q2;

	public StackUsingQueue()
	{
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	}

	public boolean isEmpty()
	{
		return q1.isEmpty();
	}

	public int size()
	{
		return q1.size();
	}

	public void push(int elem)
	{
		q1.add(elem);
	}

	public int pop()
	{
		if(q1.isEmpty())
		{
			return -1;
		}
		int temp=0;
		while(!q1.isEmpty())
		{
			temp=q1.poll();
			if(q1.isEmpty())
			{
				break;
			}
			else
			{
				q2.add(temp);
			}
		}

		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}

		return temp;
	}

	public int top()
	{
		if(q1.isEmpty())
		{
			return -1;
		}

		int temp=0;

		while(!q1.isEmpty())
		{
			temp=q1.poll();
			q2.add(temp);
		}

		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}

		return temp;
	}

}

class StackUsing2Queue
{
	public static void main(String[] args) 
	{
		StackUsingQueue s=new StackUsingQueue();

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.pop());


	}	
}