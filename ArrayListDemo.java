import java.util.ArrayList;
class ArrayListDemo
{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		System.out.println(arr.get(1));   //return index 1 value 
		System.out.println(arr.size());	//return how many element you are inserted in arr
		
	}
}