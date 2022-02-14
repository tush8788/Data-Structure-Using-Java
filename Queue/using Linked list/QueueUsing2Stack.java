/*
	implement Queue using 2 stack
*/
import java.util.Stack;
import java.util.Queue;


class QueueUsingStack
{
	private Stack<Integer> s1;
	private Stack<Integer> s2;

	public QueueUsingStack()
	{
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
	}

	boolean isEmpty()
	{
		return s1.isEmpty();
	}

	public int size()
	{
		return s1.size();
	}

	public void add(int elem)
	{
		s1.push(elem);
	}

	public int poll()
	{
		if(s1.isEmpty())
		{
			return -1;
		}

		int temp=0;
		while(!s1.isEmpty())
		{
			temp=s1.pop();
			if(s1.isEmpty())
			{
				break;
			}
			else
			{
				s2.push(temp);
			}
		}

		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}

		return temp;

	}
}

class QueueUsing2Stack
{
	public static void main(String[] args) 
	{
		QueueUsingStack q=new QueueUsingStack();
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());
		

	}	
}
