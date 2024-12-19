package QueImplementingclass;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LInkedListPrac {
	public static void main(String[] args) {
		//LinkedList implemnts Queue
		Queue list1 = new LinkedList();
		
		//LinkedList implemnts list
		List list2 = new LinkedList();
		
		LinkedList list = new LinkedList();
		
		
		list.add(10);
		list.add(5);
		list.add(5);
		list.add(20);
		list.add(null);
		
		//peek() gies first element in linked list and last in stack
		System.out.println(list.peek());
		
		//pop() removes  and gives first in lisnkedlist and last in stck
		System.out.println(list.pop());
		
		
		System.out.println("---------");
		for(Object obj:list) {
			System.out.println(obj);
		}

	}

}
