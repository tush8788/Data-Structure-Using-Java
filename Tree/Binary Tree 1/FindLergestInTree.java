import java.lang.Math;
class FindLergestInTree
{
	public static int findLergest(BinaryTree<Integer> node)
	{
		if(node==null)
		{
			return -1;
		}

		int leftLergest=findLergest(node.left);
		int rightLergest=findLergest(node.right);

		return Math.max(node.data,Math.max(leftLergest,rightLergest));

		//finding lergest bitween tree
		// if(node.data>leftLergest)
		// {
		// 	if(node.data>rightLergest)
		// 	{
		// 		return node.data
		// 	}
		// 	else
		// 	{
		// 		return rightLergest;
		// 	}
		// }
		// else if(leftLergest>rightLergest)
		// {
		// 	return rightLergest;
		// }
		// else
		// {
		// 	return rightLergest;
		// }
	}	

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		System.out.println(findLergest(root));	
	}
}