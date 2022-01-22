/*
	doubly Circuler Linked List 
*/
import java.util.Scanner;
class DoublyNode<T>
{
	DoublyNode <T> prev;
	T data;
	DoublyNode <T> next;

	DoublyNode(T data)
	{
		this.data=data;
	}
}

class DoubleCircularLinkedList
{
	public static DoublyNode<Integer> takingInput()
	{
		Scanner sc=new Scanner(System.in);
		DoublyNode head=null,tail=null;
		int data=sc.nextInt();
		while(data!=-1)
		{
			DoublyNode<Integer> curr=new DoublyNode<>(data);
			if(head==null)
			{
				head=curr;
				tail=curr;
			}
			else
			{
				curr.prev=tail;
				tail.next=curr;
				tail=curr;
			}
			data=sc.nextInt();
		}

		tail.next=head;
		head.prev=tail;

		return head;
	}	

	public static void printLL(DoublyNode<Integer> head,DoublyNode<Integer>mainhead)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		// printLL(head.next);
	}

	public static void main(String[] args) {
		
		DoublyNode<Integer> head=takingInput();
		// printLL(head);

		DoublyNode<Integer> temp=head.prev;
		System.out.println("\n"+temp.data);

	}
}