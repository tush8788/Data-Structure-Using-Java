class BinarayTree<T>
{
	T data;
	BinarayTree<T> leftNode;
	BinarayTree<T> rigthNode;

	BinarayTree(T data)
	{
		this.data=data;
	}
}

class BinaryTreeImplementation
{
	public static void main(String[] args) 
	{
		BinarayTree<Integer> root=new BinarayTree<>(1);

		BinarayTree<Integer> rootLeft=new BinarayTree<>(2);
		BinarayTree<Integer> rootRight=new BinarayTree<>(3);

		root.leftNode=rootLeft;
		root.rigthNode=rootRight;

		BinarayTree<Integer> tworight=new BinarayTree<>(4);
		BinarayTree<Integer> threeLeft=new BinarayTree<>(5);

		rootLeft.rigthNode=tworight;
		rootRight.leftNode=threeLeft;

		printNode(root);

	}	

	public static void printNode(BinarayTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		System.out.println(node.data);
		printNode(node.leftNode);
		printNode(node.rigthNode);
	}
}