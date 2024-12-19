package SetImplementingClasses;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSetPractice {

	public static void main(String[] args) {
		//TreeSet implements SortedSet
				SortedSet  set1 =new	TreeSet();
				
				
				TreeSet set = new TreeSet();
				
			
				set.add(40);
				set.add(10);
				set.add(20);
				set.add(30);
				set.add(40);
				set.add(40);
				set.add(null);
			//	set.add(null);
				set.add("json");
				
				for(Object obj : set) {
					System.out.println(obj);
				}
				
				//sort on assending order
				//stroe only homogeneos values
				//only  null values is not allowded
				
	}
}
