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

class DeleteNodeRecursively
{
 	static Scanner sc;
	//delete LinkedList node using recursion
	static Node<Integer> deleteNodeRec(Node<Integer> head,int pos)
	{
		if(head==null)
		{
			return head;
		}

		if(pos==0)
		{
			return head.next;
		}
		else
		{
			Node<Integer>newhead=deleteNodeRec(head.next,pos-1);
			head.next=newhead;
			return head;
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
		Node<Integer> head=takingInput(); //taking input from user
		printLL(head); //printing LinkedList
		System.out.println();

		System.out.println("Enter Postion to delete a node: ");
		int pos=sc.nextInt();

		head=deleteNodeRec(head,pos);
		printLL(head);
	}



}