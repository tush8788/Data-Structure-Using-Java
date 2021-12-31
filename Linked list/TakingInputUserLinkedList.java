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

class TakingInputUserLinkedList
{
	static Node<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value(Exit enter -1):");
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer>currentNode=new Node<>(data);
			if(head==null)
			{
				head=currentNode;
				tail=currentNode;
			}
			else
			{
				tail.next=currentNode;
				tail=currentNode;
			}
			System.out.println("Enter Value(Exit enter -1):");
			data=sc.nextInt();
		}

		return head;
	}

	static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		System.out.println("Your Linked List ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer>head = takeInput();
		print(head);
	}
}