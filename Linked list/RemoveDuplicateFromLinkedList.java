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

class RemoveDuplicateFromLinkedList{
	//Remove Duplicate using own logic
	static Node<Integer> removeDuplicate(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}
		else
		{
			Node<Integer>first=head,secound=null,secoundHead=null;
			secound=new Node<>(first.data);
			secoundHead=secound;

			while(first!=null)
			{
				if(first.data!=secound.data)
				{
					 Node<Integer> curr=new Node<>(first.data);
					 secound.next=curr;
					 secound=curr;
					 first=first.next;
				}
				else
				{
					first=first.next;
				}
			}

			return secoundHead;
		}

	}

	//remove Duplicate optimize Logic
	static Node<Integer> removeDuplicateOptimize(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}
		else
		{
			Node<Integer> temp=head;
			while(temp.next!=null)
			{
				if(temp.data==temp.next.data)
				{
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
			}
		}

		return head;

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
		Node<Integer> headL=removeDuplicateOptimize(head);
		printLL(headL);
	}
}