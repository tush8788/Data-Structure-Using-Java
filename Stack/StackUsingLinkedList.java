class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class StackLL<T>
{
	private Node<T> head;
	private int size;

	public void push(T data)
	{
		Node<T> curr=new Node<>(data);
		size++;
		curr.next=head;
		head=curr;
		
	}

	public T pop()
	{
		if(head==null)
		{
			//you can thorw excption also
			return null;
		}
		T temp=head.data;
		size--;
		head=head.next;
		return temp;
	}

	public int size()
	{
		return size;
	}

	public T top()
	{
		if(head==null)
		{
			return null;
		}
		return head.data;
	}

	public boolean isEmpty()
	{
		return size==0;
	}
}

class StackUsingLinkedList
{
	public static void main(String[] args) 
	{
		StackLL <Integer> stack=new StackLL<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("size of stack is: "+stack.size());
		System.out.println("top of stack is: "+stack.top());
		System.out.println("isEmpty : "+stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("size of stack is: "+stack.size());
		System.out.println("top of stack is: "+stack.top());
		System.out.println("isEmpty : "+stack.isEmpty());
	}	
}
