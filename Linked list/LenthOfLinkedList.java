class Node<T>  // Node Linked List
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}
class LenthOfLinkedList
{
	static int length(Node<Integer> head)   //return Length of Linked list 
	{
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
		public static void main(String[] args) 
		{
			Node<Integer> n1= new Node<>(10);
			Node<Integer> n2= new Node<>(10);
			Node<Integer> n3= new Node<>(10);
			Node<Integer> n4= new Node<>(10);
					
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;

			System.out.print(length(n1));
		}
		
}