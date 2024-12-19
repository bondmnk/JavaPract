package SetImplementingClasses;

import java.util.HashSet;

public class HashSetPrac {

	public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(40);
	set.add(null);
	set.add(null);
	set.add("json");
	
	for(Object obj : set) {
		System.out.println(obj);
	}
	
	//stroe hetrerogeneous values
	//only one null values is allowed becuase diplicate values are not allowed
	//order of insertion is not maintained
	}
}
