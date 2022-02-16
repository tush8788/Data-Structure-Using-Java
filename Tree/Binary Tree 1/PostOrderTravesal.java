/*
	means root is taken care first childern then own

*/

class PostOrderTravesal
{
	public static void postOrder(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}	

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();	
		postOrder(root);
	}
}