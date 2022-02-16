/*
	find given Node in tree;
*/

class FindGivenNodeInTree
{
	public static boolean findNodeX(BinaryTree<Integer> node,int x)
	{
		if(node==null)
		{
			return false;
		}

		if(node.data==x)
		{
			return true;
		}

		if(findNodeX(node.left,x))
		{
			return true;
		}

		if(findNodeX(node.right,x))
		{
			return true;
		}

		return false;
	}	

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();

		System.out.println("given node is found: "+findNodeX(root,4));
		
		
	}
}