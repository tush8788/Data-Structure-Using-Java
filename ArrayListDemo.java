import java.util.ArrayList;
class ArrayListDemo
{
	static ArrayList<Integer> arr;
	//Adding Value in Array List
	static void addingElement(Integer i)
	{
		arr.add(i);
	}

	//Geting Value using IndexNumber
	static void getingValue(Integer IndexNum)
	{
		System.out.println(arr.get(IndexNum));
	}

	//how many element you are inserted in ArrayList
	static void getSize()
	{
		System.out.println(arr.size());
	}

	//Printing ArrayList Using foreach loop
	static void printArrayList()
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	//Set value to given index (Replace)
	static void setValue(int indexNum,int value)
	{
		arr.set(indexNum,value);
	}

	//remove element using indexNumber
	static void removeValueIndex(int indexNum)
	{
		arr.remove(indexNum);
		printArrayList();
	}

	//remove element using element 
	static void removeValueValue(Integer i)
	{
		arr.remove(i);   //if value not found does not show any error 
		printArrayList();
	}

	//ading value at given postion (not replace)
	static void setValueUsingIndex(int indexNum,Integer val)
	{
		arr.add(indexNum,val);
		printArrayList();
	}

	//Main Method 
	public static void main(String[] args) {
		arr=new ArrayList<Integer>();

		addingElement(10);
		addingElement(12);
		addingElement(15);
		getingValue(0);
		printArrayList();
		setValue(1,100);
		printArrayList();
		removeValueIndex(0);
		Integer val=111;
		removeValueValue(val);
		setValueUsingIndex(0,121);
	}
}