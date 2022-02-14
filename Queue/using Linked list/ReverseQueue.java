/*
	reverse Queue
*/
import java.util.Queue;
import java.util.LinkedList;

class ReverseQueue
{
	static private void reverseQueue(Queue<Integer> input)
	{
		if(input.isEmpty())
		{
			return;
		}

		int temp=input.poll();
		reverseQueue(input);
		input.add(temp);
	}

	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);

		reverseQueue(q);
		while (!q.isEmpty()) 
		{
			System.out.println(q.poll());
		}	
	}
}