/*
*	optimied code
*
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

class InsertNodeRecursivelyOPTIMIZED 
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

	
	//inserting node in LinkedList using recursion
	static Node<Integer> insertNodeR(Node<Integer> head,int data,int postion)
	{
		if(head==null)
		{
			return head;
		}

		if(postion==0)
		{
			Node<Integer> curr=new Node<>(data);
			curr.next=head;
			return curr;
		}
		else
		{
			Node<Integer>newhead=insertNodeR(head.next,data,postion-1);
			head.next=newhead;
			return head;
		}

	}
	//main method 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node<Integer>head=takeInput();  //taking input of LinkedList
		printRec(head); //calling print method 
		System.out.println();// for just next line 
		System.out.println("Enter data: ");
		int data=sc.nextInt(); //taking input
		System.out.println("Enter postion: ");
		int postion=sc.nextInt();  //taking input
		
		head=insertNodeR(head,data,postion); 
		printRec(head);
	}
}