class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}
}

class InsertNodeInLinkedList
{
	static void print(Node<Integer>head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

	static int lengthOfLinkedList(Node<Integer>head)
	{
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}

		return count;
	}
	static Node<Integer> insert(Node<Integer> head,int pos,int data)
	{
		int length=lengthOfLinkedList(head);
		if(pos>length)
		{
			return head;
		}
		else if(pos==0)
		{
			Node<Integer>n1=new Node<Integer>(data);
			n1.next=head;
			return n1;
		}
		else
		{
			Node<Integer>curr=head,priv=null,n1;
			int j=0;
			while(pos!=j)
			{
				priv=curr;
				curr=curr.next;
				j++;
			}
			n1=new Node<>(data);
			priv.next=n1;
			n1.next=curr;

			return head;

		}
	}

	public static void main(String[] args) {
			Node<Integer>n1=new Node<>(10);
			Node<Integer>n2=new Node<>(20);
			Node<Integer>n3=new Node<>(30);
			Node<Integer>n4=new Node<>(40);

			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			print(n1);

			Node<Integer>head=insert(n1,0,30);
			print(head);
		}	
}