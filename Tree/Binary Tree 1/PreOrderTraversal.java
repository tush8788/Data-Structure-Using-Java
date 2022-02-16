/*
	preoder traversal means root is taken care of own then child here root is print first then childs are printing
	Output
	
	1:L2, R3
	2:L4, R5
	4:
	5:
	3:R7
	7:

	1 2 4 5 3 7
*/
class PreOrderTraversal
{
	public static void preOrder(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		System.out.print(root.data+" ");

		preOrder(root.left);
		preOrder(root.right);
	}	

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		preOrder(root);	
	}
}