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

class PrintLinkedList{

	static void printRec(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data+" ");
		printRec(head.next);

	}
	
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

	public static void main(String[] args) {
		
		Node<Integer>head=takeInput();
		printRec(head);
	}
}