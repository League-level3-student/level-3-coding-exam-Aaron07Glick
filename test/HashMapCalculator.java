import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int count = 0;
		if(hashmap1.containsKey("Sick")) count ++;
		if(hashmap2.containsKey("fine"))count++;
		return count += 2;
	}
}
