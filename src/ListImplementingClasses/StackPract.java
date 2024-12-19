package ListImplementingClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackPract {

	public static void main(String[] args) {
		List list=new Vector();
		//Vector implements List
		//Stack extends Vector
		Stack list1 =new Stack();
		list1.add(10);
		list1.add(5);
		list1.add(51);
		list1.push(111);
		
		//pop() method removes last object and gives last object
		list1.pop();
		
		//peek() will give last object
		Object ob=list1.peek();
		System.out.println(ob);
		
		for(Object obj:list1) {
			System.out.println(obj);
		}
		
	// ArrayList is not synchronized.
	//Vector is synchronized.
		
	}
}
