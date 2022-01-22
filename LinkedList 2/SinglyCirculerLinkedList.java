/*
	Singly Circuler Linked List 
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

class SinglyCirculerLinkedList
{
	public static Node<Integer> takingInput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while (data!=-1)
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
		tail.next=head;
		return head;
	} 

	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		do 
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=head);

		System.out.println();
	}

	public static void main(String[] args) 
	{
		Node<Integer> head=takingInput();
		print(head);		
	}	
}