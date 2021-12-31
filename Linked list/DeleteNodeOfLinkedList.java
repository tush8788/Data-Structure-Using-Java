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

class DeleteNodeOfLinkedList{

	//Taking Input from user
	static Node<Integer> takingInput()  
	{
		Scanner sc=new Scanner(System.in);
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

	//Deleting Element from LinkedList
	static Node<Integer> deleteNode(Node<Integer> head,int pos)
	{
		if(head==null)
		{
			return head;
		}
		else
		{
			if(pos==0)
			{
				head=head.next;
				return head;
			}
			else
			{
				Node<Integer>curr=head;
				int count=0;
				while(count<pos-1 && curr!=null)
				{
					count++;
					curr=curr.next;
				}

				if(curr!=null)
				{
					try
					{
						curr.next=curr.next.next;
					}
					catch(NullPointerException e)
					{
						return head;
					}
				}
				return head;
			}
		}
	}

	//Printing LinkedList
	public static void print(Node<Integer>head)
	{
			while(head!=null)
			{
				System.out.print(head.data+" ");
				head=head.next;
			}
			System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Node<Integer>head=takingInput();
		System.out.println("Enter Postion Number: ");
		int pos=sc.nextInt();
		head=deleteNode(head,pos);
		print(head);
	}
}