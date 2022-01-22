/*
	reverse LinkedList input 1234
	Output 4321   
	time compelxity 0(n)
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

class DoubleNode
{
	Node head;
	Node tail;
	DoubleNode(Node head,Node tail)
	{
		this.head=head;
		this.tail=tail;
	}
}

class ReverseLinkedListBetterOption 
{
	static Node<Integer> takingInput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
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

	static DoubleNode reverseListBetter(Node<Integer> head)
	{
		DoubleNode ob;
		if(head.next==null || head==null)
		{
			ob=new DoubleNode(head,head);
			return ob;
		}

		DoubleNode ans=reverseListBetter(head.next);

		ans.tail.next=head;
		ans.tail=head;
		ans.tail.next=null;

		return ans;

	}

	public static void main(String[] args) {
		Node<Integer> head=takingInput();
		printLL(head);

		System.out.println();
		
		DoubleNode ans=reverseListBetter(head);
		printLL(ans.head);
	}
}