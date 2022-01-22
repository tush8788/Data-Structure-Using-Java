/*
	Collection Frimwork Linkedlist
*/

import java.util.LinkedList;

class CollectionLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println(list.isEmpty());				//if LinkedList is empty they return ture 

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.add(1,100);
		print(list);								   // printing the LinkedList

		System.out.println(list.remove());				// remove first element in linkedlist 
		System.out.println(list.removeLast());			// remove last element in linkedlist

		list.set(0,500);  //replace 0 index element with 500 
		System.out.println("Size Of LinkedList : "+list.size());   // return size of linkedlist
		print(list);



	}	

	public static void print(LinkedList<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}

		System.out.println();
	}
}