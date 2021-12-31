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

class FindNodeInLinkedList{
	static Scanner sc;
	static Node<Integer> takingInput()
	{
		sc=new Scanner(System.in);
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

	static int findElement(Node<Integer> head,int n)
	{
		int positon=-1;
		while(head!=null)
		{
			positon++;
			if(n==head.data)
			{
				return positon;
			}
			head=head.next;
		}

		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> head=takingInput();
		System.out.println("Enter the element");
		int ele=sc.nextInt();
		System.out.println("Postion of "+ele+" is "+findElement(head,ele));

	}

}
