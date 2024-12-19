package ListImplementingClasses;


import java.util.ArrayList;
import java.util.List;

public class ArrayListPract {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		
		//ArrayList list is a class we impleaments the List Interface
	    //so all the methods of list we can have in ArrayList.
		
		list.add(10);
		list.add(5);
		list.add(5);
		list.add(20);
		list.add(null);
		
		list.addAll(list);
		list.add(list);
		
		//add will add whole collection as one object 
		// addAll() will add all the object of collection as individual Object
		
		list.remove(4);
		list.remove(5);
		
		//if both same object exist in the collection then remove method will remove same last Object
		
		//list.clear();
		//will remove all obejct
		
		System.out.println(list.contains(list));
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		//Order of insertion is maintained -not in set 
		//allow duplicate values - not in set
		//allows null
		

	}

}
