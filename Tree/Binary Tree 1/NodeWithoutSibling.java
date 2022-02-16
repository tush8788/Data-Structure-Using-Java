/*
	print node without sibling

	1:L2, R3
	2:L4, R5
	4:
	5:
	3:R6
	6:

	6

*/

class NodeWithoutSibling
{
	public static void countSibling(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		if(node.left==null&&node.right!=null)
		{
			System.out.print(node.right.data+" ");
		}

		if(node.left!=null&&node.right==null)
		{
			System.out.print(node.left.data);
		}

		countSibling(node.left);
		countSibling(node.right);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		countSibling(root);			
	}	
}