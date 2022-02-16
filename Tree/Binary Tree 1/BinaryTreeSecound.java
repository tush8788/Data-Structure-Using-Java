/*
	Binary tree make and print
	output
	1
	2
	4
	3
	5

	and print like this

	1:L2, R3
	2:R4
	4:
	3:L5,
	5:
*/

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

class BinaryTreeSecound
{
	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=new BinaryTree<>(1);

		BinaryTree<Integer> nodeleft1=new BinaryTree<>(2);
		BinaryTree<Integer> noderigth1=new BinaryTree<>(3);

		root.left=nodeleft1;
		root.rigth=noderigth1;

		BinaryTree<Integer> nodeleft2=new BinaryTree<>(4);
		BinaryTree<Integer> noderigth2=new BinaryTree<>(5);

		nodeleft1.rigth=nodeleft2;
		noderigth1.left=noderigth2;
		printTree(root);
		System.out.println();
		printTreeInNewWay(root);
	}

	static public void printTree(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		System.out.println(node.data);
		printTree(node.left);
		printTree(node.rigth);
	}

	static public void printTreeInNewWay(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		System.out.print(node.data+": ");

		if(node.left!=null)
		{
			System.out.print("L "+node.left.data);
		}

		if(node.rigth!=null)
		{
			System.out.print(" R "+node.rigth.data);
		}
		System.out.println();
		printTreeInNewWay(node.left);
		printTreeInNewWay(node.rigth);
		
	
	}
}