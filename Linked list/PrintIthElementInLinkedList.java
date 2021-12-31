/*
* print ith Element in linked list
* input 10 20 30 40  index of print 3
* output 40
*
*/

class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class PrintIthElementInLinkedList
{
	static void PrintElement(Node<Integer> head,int i)
	{
		try
		{
			int j=0;
			while(j!=i)
			{
				head=head.next;
				j++;
			}

			System.out.print(head.data);
		}
		catch(NullPointerException e)
		{
			System.out.println();  //handling -1 input
		}
	}	
	public static void main(String[] args) 
	{
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(30);
		Node<Integer> n3=new Node<Integer>(70);
		Node<Integer> n4=new Node<Integer>(60);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		int i=2;
		PrintElement(n1,i);
		
	}
}