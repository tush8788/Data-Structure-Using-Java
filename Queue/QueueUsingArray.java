/*
	Normal Queue
*/
import java.util.Scanner;
class QueueUse
{
	private int data[];
	private int front=-1;
	private int rear=-1;
	private int size;

	QueueUse()
	{
		data=new int[5];
	}

	QueueUse(int capacity)
	{
		data=new int[capacity];
	}

	public int size()
	{
		return size;
	}

	public boolean isEmpty()
	{
		return size==0;
	}

	public void enqueue(int elem) throws QueueFullException
	{
		if(size==data.length)
		{
			throw new QueueFullException();
		}

		rear++;
		data[rear]=elem;
		size++;
		if(front==-1)
		{
			front++;
		}
	}

	public int front() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
			return data[front];
	}

	public int dequeue() thorws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		size--;
		int temp=data[front];
		front++;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return temp;
		
	}


}

class QueueUsingArray 
{
	public static void main(String[] args) throws QueueFullException,QueueEmptyException
	{
		QueueUse queue=new QueueUse(10);
		System.out.println("Front: "+queue.front());
		System.out.println("dequeue: "+queue.dequeue());
		System.out.println("size: "+queue.size());
		System.out.println("isEmpty: "+queue.isEmpty());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("isEmpty: "+queue.isEmpty());
		System.out.println("size: "+queue.size());
		System.out.println("Front: "+queue.front());
		System.out.println("dequeue: "+queue.dequeue());
		
		System.out.println("Front: "+queue.front());
		System.out.println("dequeue: "+queue.dequeue());
		System.out.println("dequeue: "+queue.dequeue());
		System.out.println("dequeue: "+queue.dequeue());

	}
}

//For creating exception 
class QueueEmptyException extends Exception
{

}

class QueueFullException extends Exception
{

}