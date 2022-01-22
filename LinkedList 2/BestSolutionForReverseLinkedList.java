/*
	reverse LinkedList input 1234
	Output 4321   
	time compelxity 0(n)
	Best Solution for reverseLinkedList
*/
import java.util.Scanner;
class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class BestSolutionForReverseLinkedList
{
	static Node<Integer> takingInput()
	{
		Scanner sc=new Scanner(System.in);

		int data=sc.nextInt();
		Node<Integer>head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer> curr=new Node<>(data);
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
			data=sc.nextInt();
		}

		return head;
	}

	static void printLL(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		printLL(head.next);
	}

	static Node<Integer> reverseLinkedList(Node<Integer> head)
	{
		if(head.next==null || head==null)
		{
			return head;
		}

		Node<Integer> smallhead=reverseLinkedList(head.next);
		Node<Integer> tail=head.next;
		tail.next=head;
		head.next=null;

		return smallhead;
	}

	public static void main(String[] args) {
		
		Node<Integer> head=takingInput();
		printLL(head);
		System.out.println();

		head=reverseLinkedList(head);
		printLL(head);
	}
}