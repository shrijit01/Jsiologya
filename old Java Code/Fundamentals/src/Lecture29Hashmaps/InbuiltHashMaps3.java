package Lecture29Hashmaps;

import java.util.HashMap;
import java.util.Set;


public class InbuiltHashMaps3 {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> map = new HashMap<>();


		//o(1) TC
		map.put("abc",1);
		map.put("def", 3);


		//presence //o(1) TC
		if(map.containsKey("abc")) { 
			System.out.println("Map has abc ");
		}
		//o(1) TC
		if(map.containsKey("abc1")) {
			System.out.print("Map has abc1 ");
		}

		map.put("abc", 4);
		//map size//o(1) TC
		System.out.println("SIze "+map.size());

		//get value
		int val = map.get("abc");
		System.out.println("val "+val);

		int val2 = 0;
		if(map.containsKey("abc1")) {
			val2 = map.get("abc1");
		}
		System.out.println(val2);


		//remove o(1)
		map.remove("abc1");
		if(map.containsKey("abc1")) {
			System.out.print("Map has abc ");
		}

		//iteration on hash map //o(1) TC
		Set<String> keys = map.keySet();
		boolean value = map.containsValue("abc");
		for(String s :keys) {
			System.out.println(s);
		}
		System.out.println("Value "+ value);


	}

}
