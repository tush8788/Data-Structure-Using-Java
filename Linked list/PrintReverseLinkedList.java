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

class PrintReverseLinkedList
{

	static Node<Integer> reverseLL(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}
		else
		{
			Node<Integer>temp=head,secound=null;
			secound=new Node<>(temp.data);
			temp=temp.next;
			while(temp!=null)
			{
				Node<Integer> curr=new Node<>(temp.data);
				curr.next=secound;
				secound=curr;
				temp=temp.next;
			}

			return secound;
		}
	}
	static Node<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer>head=null,tail=null;
		while(data != -1)
		{
			Node<Integer>curr=new Node<>(data);
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
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

		System.out.println();
	}

	public static void main(String []args)
	{
		Node<Integer>head=takeInput();
		printLL(head);
		head=reverseLL(head);
		printLL(head);
		
	}	
}