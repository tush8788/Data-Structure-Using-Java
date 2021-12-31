import java.util.*;
class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
		// next=null   //not need to spcifiy becasue its bydefaults is null  
	}
}

class LinkedListDemo
{
	// static Scanner sc;
	static Node<Integer> createLinkedList()
	{
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;

		return n1;
	}

	static void printLinkedList(Node<Integer> head)
	{
		do
		{
			System.out.print(head.data+" ");
			head=head.next;
		}while(head!=null);
	}

	public static void main(String[] args) {
		
		Node<Integer> head=createLinkedList();
		printLinkedList(head);
			
	}
}