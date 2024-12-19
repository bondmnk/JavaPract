package SetImplementingClasses;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LInkedHashsetPrac {

	public static void main(String[] args) {
		
		//LinkedHashSet extends hashset
		HashSet  set1=new	LinkedHashSet();
		
		
	LinkedHashSet set = new LinkedHashSet();
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
	//only one null values is allowded
	//order of insertion is  maintained
}
	
}
