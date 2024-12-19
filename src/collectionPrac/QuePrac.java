package collectionPrac;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QuePrac {

	public static void main(String[] args) {
		
	Queue qe =new PriorityQueue();
		
		//PriorityQueue  is a class we impleaments the Queue Interface
	    //so all the methods of Set we can have in PriorityQueue.
		
	qe.add(10);
	qe.add(5);
	qe.add(5);
	qe.add(20);
//	qe.add(null);
	
	
	for(Object obj:qe) {
		System.out.println(obj);
	}
	
	//Order of insertion is not maintained as set
	//allow duplicate values as list
	//Not allows null
	//we can access by only for-each loop and iterator 
	}

}
