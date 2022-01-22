/*
	input 1 2 3 4 5 6 7 8
	m=2 n=3

	output 1 2 6 7
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

class Skip_M_Delete_N_Node
{
	static Scanner sc;
	public static Node<Integer> takingInput()
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

	public static void print(Node<Integer> head)	
	{
		if(head==null)
		{
			return;
		}

		System.out.print(head.data);
		print(head.next);
	}

	public static Node<Integer> skipMDeleteNNode(Node<Integer> head,int m,int n)
	{
		Node<Integer> newhead=head;
		int c1=1,c2=1;
		if(m==0)
		{
			return null;
		}
		else if(n==0)
		{
			return head;
		}
		else
		{
			while(head!=null)
			{
				while(c1<m)
				{
					if(head==null)
					{
						return newhead;
					}
					head=head.next;
					c1++;
				}

				Node<Integer> temp=head;
				head=head.next;
				temp.next=null;

				while(c2<n)
				{
					if(head==null)
					{
						return newhead;
					}
					head=head.next;
					c2++;
				}

				temp.next=head.next;
				head=head.next;
				c1=1;
				c2=1;
			}

			return newhead;
		}
	}

	public static void main(String[] args) 
	{
		Node<Integer> head=takingInput();
		System.out.println("Enter M and N: ");
		int m=sc.nextInt();
		int n=sc.nextInt();

		print(head);

		Node<Integer>newhead=skipMDeleteNNode(head,m,n);
		System.out.println();
		print(newhead);		
	}	
}