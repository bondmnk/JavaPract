package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapPrc {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put("mnk", 10);
		map.put("mnk", 20);
		map.put(20, 10);
		map.put("mnk1", 101);
		map.put("mnk2", 102);
		map.put("mnk3", 103);
		map.put("mnk4", 104);
		map.put(null, 104);
		
		//duplicate keys are not allowded through map, duplicate values are allowded throught the map
		//ordr of insertion is not maintained
		//null keys are allowded
		
		
		System.out.println();
		System.out.println(map.get("mnk"));
		
		Set set = map.entrySet();
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
}
