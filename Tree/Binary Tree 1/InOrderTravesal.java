/*
	here first taken care of left, then root and last rigth its called inOrder traversal

	Output
	1:L2, R3
	2:L4, R5
	4:
	5:
	3:

	4 2 5 1 3

*/

class InOrderTravesal
{
	public static void inOrder(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();	
		inOrder(root);			
	}	
}