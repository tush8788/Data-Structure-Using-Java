/*
*	Input 1 2 3 4 5  n=3
*	output 3 4 5 1 2
*
*	input 10 6 77 90 61 67 100  n=4
*   Output 90 61 67 100 10 6 77
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

class AppendLastNToFirst{

	static Scanner sc;
	//Taking input from user
	static Node<Integer> takingInput()
	{
		sc=new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		int data=sc.nextInt();
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
	//Finding length of LinkedList
	static int lengthOfLinkedList(Node<Integer> head)
	{
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}

		return count;
	}
	//appending last to first
	static Node<Integer> append(Node<Integer> head,int n)
	{
		Node<Integer> newhead=null,oldhead=head,orignalhead=head;
		int len=lengthOfLinkedList(head);
		if(n==0||len<n)
		{
			return head;
		}
		else
		{
			len=len-n;
			int j=0;
			while(j<len-1)
			{
				j++;
				oldhead=oldhead.next;
			}

			newhead=oldhead.next;
			head=newhead;
			oldhead.next=null;

			while(newhead.next!=null)
			{
				newhead=newhead.next;
			}

			newhead.next=orignalhead;

			return head;
		}
	}
	//printing Linkedlist
	static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

		System.out.println();
	}

	//main method
	public static void main(String[] args) {
		Node<Integer> head=takingInput();

		System.out.println("Enter The Number ");
		int n=sc.nextInt();
		head=append(head,n);
		print(head);

	}
	
}