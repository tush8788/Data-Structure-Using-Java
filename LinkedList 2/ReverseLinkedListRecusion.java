/*
	reverse LinkedList input 1234
	Output 4321   
	time compelxity 0(n^2)
*/

import java.util.*;
class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class ReverseLinkedListRecusion{
	static Scanner sc;
	static Node<Integer> reverseLinkedList(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}

		if(head.next==null)
		{
			return head;
		}
		else
		{
			Node<Integer> newHead=reverseLinkedList(head.next);
			Node<Integer> tail=newHead;
			while(tail.next!=null)
			{
				tail=tail.next;
			}

			tail.next=head;
			head.next=null;
			return newHead;
		}
	}

	// printing LinkedList 
	static void printLL(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		printLL(head.next);
	}

	//taking Input from user
	static Node<Integer> takingInput()
	{
		sc=new Scanner(System.in);
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


	public static void main(String[] args) {
		Node<Integer> head= takingInput();
		printLL(head);
		System.out.println();
		head=reverseLinkedList(head);
		printLL(head);
	}

	
}