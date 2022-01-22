/*
*	Input :10 20 30  postion 2,data 100
*	output : 10 20 100 30
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

class InsertNodeRecursively 
{
	// print linked List in recursion 
	static void printRec(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		printRec(head.next);

	}
	// taking input from user
	static Node<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer> curr=new Node<Integer>(data);
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

	static int count=0;  //storing intration count of recursion 
	//inserting node in LinkedList using recursion
	static Node<Integer> insertRec(Node<Integer> head,int data,int postion)
	{
		if(head==null)
		{
			return head;
		}
		else if(postion==0)
		{
			// System.out.println("In postion 0 "+postion);
			Node<Integer> curr=new Node<>(data);
			curr.next=head;
			return curr;
		}
		else if(count==postion-1)
		{
			Node<Integer> curr=new Node<>(data);
			curr.next=head.next;
			head.next=curr;
			return head;
		}
		else
		{
			count++;
			Node<Integer> newhead= insertRec(head.next,data,postion);
			return head;
		}

	}
	//main method 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node<Integer>head=takeInput();
		printRec(head);
		System.out.println();
		System.out.println("Enter data: ");
		int data=sc.nextInt();
		System.out.println("Enter postion: ");
		int postion=sc.nextInt();
		head= insertRec(head,data,postion);
		printRec(head);
	}
}