/*
	Queue using Linked list
*/

class Node<T>
{
	T data;
	Node<T> next;

	public Node(T data)
	{
		this.data=data;
	}
}

class QueueLL<T>
{
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public QueueLL()
	{
		head=null;
		tail=null;
		size=0;
	}

	public int getSize()
	{
		if(size==0)
		{
			return -1;
		}
		return size;
	}	

	public boolean isEmpty()
	{
		return size==0;
	}

	public void enqueue(T elem)
	{
		Node<T> curr=new Node<>(elem);

		if(head==null)
		{
			head=curr;
			tail=curr;
		}
		else
		{
			tail.next=curr;
			tail=curr;
		}

		size++;
	}

	public T dequeue()
	{
		if(size==0)
		{
			return (T)null;
		}

		T temp=head.data;
		head=head.next;
		size--;

		return temp;
	}

	public T front()
	{
		if(size==0)
		{
			return (T)null;
		}

		return head.data;
	}
}

class QueueUsingLL
{
	public static void main(String[] args) 
	{
		QueueLL<Integer> q=new QueueLL<>();
		q.enqueue(10);	
		System.out.println("Size: "+q.getSize());
		System.out.println("isEmpty: "+q.isEmpty());		
	}	
}

