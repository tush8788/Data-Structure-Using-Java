/*
	count of nodes
*/
class CountNodesInTree
{
	public static int countNodes(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return 0;
		}

		int count=1;
		int cL=countNodes(node.left);
		int cR=countNodes(node.right);

		return (count+cL+cR);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		System.out.println("Count of node is: "+countNodes(root));
	}	
}