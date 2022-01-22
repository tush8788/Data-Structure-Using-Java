/*
	Without Using Length Functon
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

class FindMidOfLinkedList
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

	static Node<Integer> findMidOfLinkedList(Node<Integer> head)
	{
		
		if(head==null)
		{
			return head
		}

		Node<Integer> i=head,j=head;
			try
			{
				while(j.next!=null && j.next.next!=null)
				{
					j=j.next.next;
					i=i.next;
				}
			}
			catch(NullPointerException e)
			{
				return i;
			}
		
		
		return i;

	}

	public static void main(String[] args) {
		
		Node<Integer> head=takingInput();
		printLL(head);
		System.out.println();

		Node<Integer> mid=findMidOfLinkedList(head);
		System.out.println("Mid is :"+mid.data);
		// printLL(head);
	}
}