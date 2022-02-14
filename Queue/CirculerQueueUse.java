/*
	Circuler Queue
*/

class CirculerQueueUse
{
	public static void main(String[] args) throws QueueFullException,QueueEmptyException
	{
		int arr[]={10,20,30,40,50};
		CirculerQueue q=new CirculerQueue();
		for(int ele:arr)
		{
			q.enqueue(ele);
		}

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		q.enqueue(100);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}	
}


class CirculerQueue
{
	private int data[];
	private int front;
	private int rear;
	private int size;

	public CirculerQueue()
	{
		data=new int[5];
		front=-1;
		rear=-1;
		size=0;
	}

	public CirculerQueue(int capacity)
	{
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
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
		if(rear==data.length)
		{
			rear=0;
		}

		data[rear]=elem;
		size++;

		if(front==-1)
		{
			front++;
		}
	}

	public int dequeue() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}

		int temp=data[front];
		front++;
		size--;
		if(front==data.length)
		{
			front=0;
		}

		if(size==0)
		{
			rear=-1;
			front=-1;
		}

		return temp;
	}
}

class QueueEmptyException extends Exception
{

}

class QueueFullException extends Exception
{

}