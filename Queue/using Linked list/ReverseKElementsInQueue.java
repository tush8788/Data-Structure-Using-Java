/*
	reverse k th Element
	Input
	k th elem: 3
	1 2 3 4 5

	output
	3 2 1 4 5
*/
import java.util.LinkedList;
import java.util.Queue;

class ReverseKElementsInQueue
{
	static public Queue<Integer> reverseKElement(Queue<Integer> input,int k)
	{
		int count=0;
		Queue<Integer> q1=new LinkedList<>();
		while (count<k) 
		{
			q1.add(input.poll());
			count++;
		}

		reverse(q1);

		while(!input.isEmpty())
		{
			q1.add(input.poll());
		}

		return q1;
	}

	static private void reverse(Queue<Integer>input)
	{
		if(input.isEmpty())
		{
			return;
		}

		int temp=input.poll();
		reverse(input);
		input.add(temp);
	}

	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<>();

		q.add(1);	
		q.add(2);	
		q.add(3);	
		q.add(4);	
		q.add(5);

		Queue<Integer>newQueue= reverseKElement(q,3);

		while(!newQueue.isEmpty())
		{
			System.out.print(newQueue.poll()+" ");
		}	
	}
}