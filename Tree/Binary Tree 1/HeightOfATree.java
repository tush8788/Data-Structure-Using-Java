/*
	find a height of tree
*/

class HeightOfATree
{
	public static int height(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return 0;
		}

		int left=height(node.left);
		int right=height(node.right);

		if(left>right)
		{
			return 1+left;
		}
		else
		{
			return 1+right;
		}
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		System.out.println("height of a tree is: "+height(root));			
	}	
}