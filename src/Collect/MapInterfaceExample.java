package Collect;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
	public static void main(String[] srgs) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Rays");
		map.put(101, "Toms");
		map.put(102, "Nish");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
