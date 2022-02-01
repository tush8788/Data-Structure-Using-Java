class DoubleCapacityOfStack 
{
	public static void main(String[] args) throws StackEmptyException
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
		StackDoubleCapacity stack=new StackDoubleCapacity();
		for(int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}		

		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}	
}

class StackDoubleCapacity
{
	private int data[];
	private int topIndex;

	StackDoubleCapacity()
	{
		data=new int[10];
		topIndex=-1;
	}

	public void push(int elem)
	{
		if(topIndex==data.length-1)
		{
			increaseCapacity();
		}

		topIndex++;
		data[topIndex]=elem;
	}

	private void increaseCapacity()
	{
		int temp[]=data;


		data=new int[temp.length*2];

		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}

	public int pop() throws StackEmptyException
	{
		if(topIndex==-1)
		{
			throw new StackEmptyException();
		}

		int temp=data[topIndex];
		topIndex--;
		return temp;
	}

	public boolean isEmpty()
	{
		if(topIndex==-1)
		{
			return true;
		}
		return false;
	}

}

class StackEmptyException extends Exception
{

}