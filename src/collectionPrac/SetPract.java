package collectionPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPract {

	public static void main(String[] args) {
		Set set =new HashSet();
		
		//HashSet is a class we impleaments the List Interface
	    //so all the methods of Set we can have in HashSet.
		
		set.add(10);
		set.add(5);
		set.add(5);
		set.add(20);
		set.add(null);
		
		
		for(Object obj:set) {
			System.out.println(obj);
		}
		
		//Order of insertion is not maintained 
		//not allow duplicate values 
		//allows null
		//we can access by only for-each loop and iterator 

	}

}
