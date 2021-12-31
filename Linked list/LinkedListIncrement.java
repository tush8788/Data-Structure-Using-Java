class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class LinkedListIncrement
{
	static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	static void increment(Node<Integer> head)
	{
		while(head!=null)
		{
			head.data++;
			head=head.next;
		}
	}
	public static void main(String[] args) 
	{
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		n1.next=n2;
		increment(n1);
		print(n1);	
	}
	
}