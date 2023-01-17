import java.util.*;

public class MapPrinter {
	public static void printKeys(Map<String, String> map) {
		Set<String> keys = map.keySet();
		if (!map.isEmpty()) {
			for (String key : keys) {
				System.out.println(key);
			}
		}else {
					System.out.println("No Keys to Show!!!");
				}
		
		

	}

	public static void printValues(Map<String, String> map) {
		Collection<String> values = map.values();
		if (!map.isEmpty()) {
			for (String value : values) {
				System.out.println(value);
			}
			}else {
					System.out.println("No Values to Show!!!");
				}
		
		

	}

	public static void printPairs(Map<String, String> map) {
		if(!map.isEmpty()) {
			for(Map.Entry<String, String> pair : map.entrySet()) {
				System.out.println(pair.getKey()+"'s Number is: "+pair.getValue());
			}
		}else {
			System.out.println("The Number You Are Looking For Is Not On System!");
		}
	}
}