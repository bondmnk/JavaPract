package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPrac {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put("mnk", 10000);
		map.put("amnk", 20);
//		map.put(20, 10);
		map.put("mnk1", "101");
		map.put("mnk2", 102);
		map.put("mnk3", 103);
		map.put("mnk4", 104);
	//	map.put(null, 10);
		//duplicate keys are not allowded through map, duplicate values are allowded throught the map
		//only homogeneos keys
		//assending order on key
		//null keys are not  allowded
		
		
		System.out.println();
		System.out.println(map.get("mnk"));
		
		Set set = map.entrySet();
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		Collection c =map.values();
	for(Object obj : c) {
		System.out.println(obj);
	}
	}
}
