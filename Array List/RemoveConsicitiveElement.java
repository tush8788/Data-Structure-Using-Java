/*
* Qustion
* input input[]={10,20,20,20,30,40,10}
* output 10 20 30 40 10
*/

import java.util.ArrayList;
class RemoveConsicitiveElement
{
	public static void main(String[] args) 
	{
		int input[]={10,20,20,20,30,40,10};

		ArrayList <Integer> output=new ArrayList<>();

		int i=0;
		output.add((Integer)input[i]);
		i++;
		while(i<input.length)
		{
			
			if(output.get(output.size()-1)!=input[i])
			{
				output.add((Integer)input[i]);
				i++;
			}
			else
			{
				i++;
			}
		}

		for(int k:output)
		{
			System.out.print(k+" ");
		}
		
	}
	
}