import java.util.*;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		Map<String, String> me = new HashMap<>();
		MapPrinter ma = new MapPrinter();
		
		
		
		
		m.put("Alice", "555-1234");
		m.put("Alex", "556-1234");
		m.put("Selam", "555-4321");
		m.put("Alireza", "556-4321");
		
		
		
		ma.printKeys(m);
		ma.printKeys(me);
		ma.printValues(m);
		ma.printValues(me);
		ma.printPairs(m);
		ma.printPairs(me);
		
		
		
		
		
	}

}
