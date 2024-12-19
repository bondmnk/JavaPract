package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("mnk", 10);
		map.put("mnk", 20);
		map.put(20, 10);
		map.put("mnk1", 101);
		map.put("mnk2", 102);
		map.put("mnk3", 103);
		map.put("mnk4", 104);
		
		//duplicate keys are not allowded through map, duplicate values are allowded throught the map
		System.out.println();
	
		System.out.println(map.get("mnk"));
		//key needs to pass for the get method
		Set set = map.entrySet();
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
		Collection c =map.values();
	for(Object obj : c) {
		System.out.println(obj);
	}
			Set set1 = map.keySet();
			for(Object obj : set1) {
				System.out.println(obj);
			}
			
		map.remove(20);
		//with key
		
		map.replace("mnk4", "4---");
Set set2 = map.entrySet();
		
		for(Object obj : set2) {
			System.out.println(obj);
		}
		
			
	}}
