/*
* Secound Logic 
* Qustion
* input input[]={10,20,20,20,30,40,10}
* output 10 20 30 40 10
*/
import java.util.ArrayList;
class SecoundLogicOfConsicative 
{
	//this function return final ArrayList
	static ArrayList<Integer> RemoveConsicativeElement(int arr[])
	{
		ArrayList<Integer> output=new ArrayList<>();
		output.add(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				output.add(arr[i]);
			}
		}

		return output;
	}

	static void printArrayList(ArrayList<Integer>output)
	{
		for(int i:output)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		
		int input[]={10,10,20,20,20,30,40,10};
		ArrayList<Integer> output=RemoveConsicativeElement(input);
		printArrayList(output);
	}
	
}