import java.util.Scanner;

class BinaryTree<T>
{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> rigth;

	BinaryTree(T data)
	{
		this.data=data;
	}
}


class TakingInputUser
{
	public static BinaryTree<Integer> takingInput()
	{
		Scanner sc=new Scanner(System.in);
		BinaryTree<Integer> node,nodeLeft=null,nodeRight=null;
		System.out.println("Enter a Value: ");
		int val=sc.nextInt();
		node=new BinaryTree<>(val);

		System.out.println("add "+val+" left side (press 1 for yes / press any Number for not):");
		int ch=sc.nextInt();
		if(ch==1)
		{
			nodeLeft=takingInput();
		}
		node.left=nodeLeft;

		System.out.println("add "+val+" right side (press 2 for yes / press any Number for not):");
		ch=sc.nextInt();
		if(ch==2)
		{
			nodeRight=takingInput();
		}
		node.rigth=nodeRight;

		return node;
	}

	public static void main(String[] args) 
	{
		
		BinaryTreeSecound ob=new BinaryTreeSecound();
		BinaryTree<Integer> root=takingInput();
		ob.printTreeInNewWay(root);



	}
}