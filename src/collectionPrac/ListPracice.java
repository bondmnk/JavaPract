package collectionPrac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPracice {

	public static void main(String[] args) {
		
		
	List list =new ArrayList();
	
	//ArrayList list is a class implemnts the List Interface
    //so all the methods of list we can have in ArrayList.
	
	// to add
	list.add(10);
	list.add(5);
	list.add(8);
	list.add(20);
	list.add(null);
	
	//to fectch
	System.out.println(list.get(0));
	
	for(Object obj:list) {
		System.out.println(obj);
	}
	
	Iterator itr = list.iterator();
	
	System.out.println(itr.hasNext());
	System.out.println(itr.next());
	System.out.println(itr.next());

	
	 ListIterator itr1 = list.listIterator();
		System.out.println("-------------------");
	System.out.println(itr1.hasNext());
	System.out.println(itr1.next());
	System.out.println(itr1.next());
	System.out.println(itr1.next());
	System.out.println(itr1.hasPrevious());
	System.out.println(itr1.previous());
	System.out.println(itr1.previous());
	System.out.println(itr1.hasPrevious());
	
	
	list.remove(0);
	//we can remove on index , on objkect or all elements by removeAll();
	
	
	
	//next() method will give next element but start from first
	//previous() method will give previous element start from that ellemt
	//Order of insertion is maintained -not in set 
	//allow duplicate values - not in set
	//allows null
	//we can access by get() ,for each loop , iterator and listIterator
	
	}

}
