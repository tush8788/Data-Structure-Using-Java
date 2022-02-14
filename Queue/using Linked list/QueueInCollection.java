/*
	Queue in collection
*/
import java.util.*;

class QueueInCollection
{
	public static void main(String[] args) {

		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		System.out.println(q.size());  
		System.out.println(q.peek());  //return top element
		System.out.println(q.poll());  //like dequeue function work
		System.out.println(q.size()); 
		System.out.println(q.remove());   
		System.out.println(q.size());  //alternative to poll work like dequeue function work
	}
}