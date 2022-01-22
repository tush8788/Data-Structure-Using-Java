/*
	input  L1: 1 3 5
		   L2: 2 4 6 12 15

	output: 1 2 3 4 5 6 12 15

	time complecty O(m+n) becuse here you are created new LinkedList
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

class MergeSortedList
{
	public static Node<Integer> takingInput()
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

	public static void printLL(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		printLL(head.next);
	}	

	//1st logic creating new LinkedList
	public static Node<Integer> mergeTwoLinkedList(Node<Integer> n1,Node<Integer> n2)
	{
		
		Node<Integer> n=null,newhead=null;


		while(n1!=null && n2!=null)
		{
			if(n1.data<n2.data)
			{
				Node<Integer> curr=new Node<>(n1.data);
				if(n==null)
				{
					n=curr;
					newhead=curr;
				}
				else
				{
					n.next=curr;
					n=n.next;
				}

				n1=n1.next;
			}
			else
			{
				Node<Integer> curr=new Node<>(n2.data);
				if(n==null)
				{
					n=curr;
					newhead=curr;
				}
				else
				{
					n.next=curr;
					n=n.next;
				}

				n2=n2.next;
			}
		}

		while(n1!=null)
		{
			Node<Integer> curr=new Node<>(n1.data);
				if(n==null)
				{
					n=curr;
					newhead=curr;
				}
				else
				{
					n.next=curr;
					n=n.next;
				}

				n1=n1.next;
		}

		while(n2!=null)
		{
			Node<Integer> curr=new Node<>(n2.data);
				if(n==null)
				{
					n=curr;
					newhead=curr;
				}
				else
				{
					n.next=curr;
					n=n.next;
				}

				n2=n2.next;
		}

		return newhead;
	}

	//2nd logic just changing references optimized Logic of merge LinkedList
	public static Node<Integer> mergeTwoLinkedListWithNewLogic(Node<Integer> n1,Node<Integer> n2)
	{
		Node<Integer> newhead=null,n=null;

		while(n1!=null && n2!=null)
		{

			if(n1.data<n2.data)
			{
				if(n==null)
				{
					n=n1;
					newhead=n1;
					n1=n1.next;
				}
				else
				{
					n.next=n1;
					n1=n1.next;
					n=n.next;
				}
			}

			else 
			{
				if(n==null)
				{
					n=n2;
					newhead=n2;
					n2=n2.next;
				}	
				else
				{
					n.next=n2;
					n=n2;
					n2=n2.next;

				}
			}
		}

		if(n1!=null)
		{
			if(n==null)
			{
				return n1;
			}
			n.next=n1;
		}
		else if(n2!=null)
		{
			if(n==null)
			{
				return h2;
			}
			n.next=n2;
		}

		return newhead;

	}




	public static void main(String[] args) {
		Node<Integer> n1=takingInput();
		printLL(n1);
		System.out.println();
		Node<Integer> n2=takingInput();
		printLL(n2);
		System.out.println();
		// Node<Integer> newhead=mergeTwoLinkedList(n1,n2);
		Node<Integer> newhead=mergeTwoLinkedListWithNewLogic(n1,n2);
		printLL(newhead);
	}
}