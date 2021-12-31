/*
*	Print reverse LinkedList using Recursion
* Input 1 2 3 4 5
* output 5 4 3 2 1
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

class PrintReverseLinkedListOptimazeRecursion{

	static void reverseLinkedList(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			reverseLinkedList(root.next);
			System.out.print(root.data+" ");
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

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		reverseLinkedList(head);
	}
	
}