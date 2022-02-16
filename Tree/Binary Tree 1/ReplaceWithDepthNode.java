/*
	replace node with depth value (means level value ) like root depth value is 0 below root 1 then below 2
	1:L2, R3
	2:
	3:

	after repalcing:
	0:L1, R1
	1:
	1:

*/

class ReplaceWithDepthNode
{
	static int level=0;
	public static void replaceWithDepth(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return;
		}

		node.data=level;

		level++;
		replaceWithDepth(node.left);
		replaceWithDepth(node.right);
		level--;
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();

		replaceWithDepth(root);
		System.out.println("after repalcing: ");
		TakingInputUserSecound.printTree(root);
	}	
}