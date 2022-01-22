/*
	Even after odd first

	input 1 2 3 4 5
	output 1 3 5 2 4

	input 2 4 6
	output 2 4 6

	input 
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

class EvenAfterOdd
{
	static Scanner sc;
	public static Node<Integer> takingInput()
	{
		sc=new Scanner(System.in);
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

	public static void print(Node<Integer> head)	
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data);
		print(head.next);
	}
	
	public static Node<Integer> evenAfterOddFirst(Node<Integer> head)
	{
		Node<Integer> evenhead=null,eventail=null,oddhead=null,oddtail=null;
		while(head!=null)
		{
			if(head.data%2==0)
			{
				if(evenhead==null)
				{
					evenhead=head;
					eventail=head;
				}
				else
				{
					eventail.next=head;
					eventail=head;
				}
			}
			else
			{
				if(oddhead==null)
				{
					oddhead=head;
					oddtail=head;
				}
				else
				{
					oddtail.next=head;
					oddtail=head;
				}	
			}

			head=head.next;
		}

		if(evenhead!=null && oddhead!=null)
		{
			oddtail.next=evenhead;
			eventail.next=null;
		}
		else if(oddhead==null)
		{
			return evenhead;
		}

		return oddhead;
	}	

	public static void main(String[] args) {
		Node<Integer> head=takingInput();
		print(head);
		System.out.println();

		Node<Integer>newhead= evenAfterOddFirst(head);

		print(newhead);
	}
}