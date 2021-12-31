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

class PalindromeLinkedList{

	static boolean isPalindrome(Node<Integer> head)
	{
		 if(head==null)
        {
            return true;
        }
        
        int len=length(head);
        
        if(len%2==0)
        {
            len=len/2;

        }
        else
        {
            len=(len/2)+1;;
        }
         // System.out.print(len);
        Node<Integer> n1=head,n2=null,newLL=null;
        int i=0;
        while(i<len)
        {
            i++;
            n1=n1.next;
        }
        System.out.println("n1 data "+n1.data);
        n2=n1;
        n1=new Node<>(n2.data);
        n2=n2.next;
        while(n2!=null)
        {
        	Node<Integer> curr=new Node<>(n2.data);
        	curr.next=n1;
        	n1=curr;
        	n2=n2.next;
        }
        
        
        print(n1);
        while(n1!=null)
        {
            if(head.data!=n1.data)
            {
                return false;
            }
            n1=n1.next;
            head=head.next;
        }
        
        return true;
        		
	}

	 static int length(Node<Integer> head)
    {
    	int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count ;
    }

	static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

		System.out.println();
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
		System.out.print(isPalindrome(head));
	}
	
}