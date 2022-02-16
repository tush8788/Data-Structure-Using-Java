/*
	means print spcific level node 0 means root node print ,1 means print below of root nodes
*/

class NodePrintDepthK
{
	public static void printDepthNode(BinaryTree<Integer> node,int k)
	{
		if(node==null)
		{
			return;
		}

		if(k==0)
		{
			System.out.println(node.data);
			return;
		}
		
		printDepthNode(node.left,k-1);
		printDepthNode(node.right,k-1);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		printDepthNode(root,3);		
	}	
}