/*
	count nodes Greter then X 
*/
import java.util.Scanner;
class BinaryTree<T>
{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;

	public BinaryTree(T data)
	{
		this.data=data;
	}
}

class CountNodesGreterThenX
{
	static Scanner sc;
	public static int countNodeGreterX(BinaryTree<Integer> node,int x)
	{
		if(node==null)
		{
			return 0;
		}

		int left=countNodeGreterX(node.left,x);
		int right=countNodeGreterX(node.right,x);

		if(node.data>x)
		{
			return (1+left+right);
		}
		else
		{
			return (left+right);
		}
	}

	public static BinaryTree<Integer> takingInput()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int val=sc.nextInt();
		if(val==-1)
		{
			return null;
		}
		BinaryTree<Integer>node,leftNode=null,rightNode=null;
		node=new BinaryTree<>(val);

		System.out.println(val+" left side: ");
		leftNode=takingInput();

		System.out.println(val+" right side: ");
		rightNode=takingInput();

		node.left=leftNode;
		node.right=rightNode;

		return node;
	}

	public static void printTree(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		System.out.print(node.data+" :");
		
		if(node.left!=null)
		{
			System.out.print("L"+node.left.data+" ,");
		}

		if(node.right!=null)
		{
			System.out.print("R"+node.right.data);
		}
		System.out.println();

		printTree(node.left);
		printTree(node.right);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer>root=takingInput();
		System.out.println();
		printTree(root);
		System.out.println();
		System.out.println("Enter X value");	
		int x=sc.nextInt();
		System.out.println("greter then x: "+countNodeGreterX(root,x));
	}
}