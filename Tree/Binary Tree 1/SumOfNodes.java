/*
	sum of nodes 
	1:L2, R3
	2:L4, R5
	4:
	5:
	3:

	sum of nodes is: 15
*/
class SumOfNodes
{
	public static int getSum(BinaryTree<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}

		int leftSum=getSum(root.left);
		int rightSum=getSum(root.right);

		return (root.data+leftSum+rightSum);
	}	

	public static void main(String[] args) 
	{
		BinaryTree<Integer> root=TakingInputUserSecound.takingInputSecoundLogic();
		System.out.println();
		TakingInputUserSecound.printTree(root);
		System.out.println();
		System.out.println("sum of nodes is: "+getSum(root));	
	}
}