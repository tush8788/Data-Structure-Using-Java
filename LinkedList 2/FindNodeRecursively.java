/*
	Find Node in LinkedList using recursivly 
	input 1 2 4 5 6;
		   4

	output 2

	input 1 2 3 4 5

		  6
	output	-1
*/
import java.util.Scanner;
class Node<T>
{
	T data;
	Node<Integer> next;
	Node(T data)
	{
		this.data=data;
	}
}

class FindNodeRecursively
{
	//taking input from user
	static Scanner sc;
	static Node<Integer> takingInput()
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

	//printing LinkedList
	static void print(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data);
		print(head.next);
	}	

	public static int findNodeRec(Node<Integer> head,int n)
	{
		if(head==null)
		{
			return -1;
		}
		else if(head.data==n)
		{
			return 0;
		}
		else
		{
			int count=findNodeRec(head.next,n);
			if(count==-1)
			{
				return -1;
			}
			else
			{
				count++;
				return count;
			}
		}
	}

	public static void main(String[] args) 
	{
		Node<Integer> head=takingInput();
		print(head);

		System.out.println("\nEnter element: ");
		int n=sc.nextInt();	

		System.out.println("Index Number: "+findNodeRec(head,n));
	}
}
