package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class runner {
	public static void main(String[] args) {

		Map<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("France", "Paris");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Turkey", "Istanbal");

		System.out.println("The size of the Hash Map is: " + capitalCities.size());
		System.out.println("Here I got a a value by its key: " + capitalCities.get("England"));

		System.out.println("Here I got all keys and values in a Hash Map using a for each loop and .entrySet: ");
		for (Entry<String, String> y : capitalCities.entrySet()) {
			System.out.println(y);
		}
	}
}
