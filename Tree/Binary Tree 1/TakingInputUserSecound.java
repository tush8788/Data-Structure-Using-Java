import java.util.Scanner;
class BinaryTree<T>
{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	BinaryTree(T data)
	{
		this.data=data;
	}
}

class TakingInputUserSecound
{
	public static BinaryTree<Integer> takingInputSecoundLogic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value: ");
		int val=sc.nextInt();
		if(val==-1)
		{
			return null;
		}

		BinaryTree<Integer> nodeLeft=null,nodeRight=null,node;
		node=new BinaryTree<>(val);

		System.out.println("add "+val+" left side: ");
		nodeLeft=takingInputSecoundLogic();

		System.out.println("add "+val+" right side: ");
		nodeRight=takingInputSecoundLogic();

		node.left=nodeLeft;
		node.right=nodeRight;

		return node;
	}	

	public static void printTree(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		System.out.print(root.data+":");

		if(root.left!=null)
		{
			System.out.print("L"+root.left.data+", ");
		}

		if(root.right!=null)
		{
			System.out.print("R"+root.right.data);
		}

		System.out.println();

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=takingInputSecoundLogic();	
		printTree(root);
	}
}