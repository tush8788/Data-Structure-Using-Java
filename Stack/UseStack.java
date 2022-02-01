class UseStack
{
	public static void main(String[] args) throws StackFullException
	{
		Stack st=new Stack();
		st.push(10);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(20);
		 st.push(30);
		 // st.push(20);
		// System.out.println(st.pop());
		// System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		System.out.println("top is "+st.top());
	}	
}

class Stack
{
	private int data[];
	private	int topIndex=-1;

	Stack()
	{
		data=new int[10];
	}

	Stack(int size)
	{
		data=new int[size];
	}
	public void push(int elem) throws StackFullException
	{
		if(topIndex==data.length-1)
		{
			throw new StackFullException();
		}

		topIndex++;
		data[topIndex]=elem;
	}

	public int pop()
	{
		if(topIndex==-1)
		{
			return -1;
		}
		else
		{
			int val=data[topIndex];
			data[topIndex]=-1;
			topIndex--;
			return val;
		}
	}

	public boolean isEmpty()
	{
		if(topIndex<0)
		{
			return	true;
		}
		else
		{
			return false;
		}

	}

	public int size()
	{

		return topIndex+1;
	}

	public int top()
	{
		if(topIndex==-1)
		{
			return -1;
		}
		return data[topIndex];
	}
}


class StackFullException extends Exception
{

}