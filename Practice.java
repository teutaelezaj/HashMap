import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		HashMap<String, Integer> population = new HashMap<String, Integer>();
		
						//key	//value
		population.put("USA", 330000000);
		population.put("Canada", 38000000);
		population.put("India", 1380000000);
		population.put("China", 1402000000);
		population.put("South Africa", 59000000);
		population.put("Russia", 144100000);
		
		for(String i : population.keySet()) { //iterate once for each key within the hash map
			System.out.print(i+"\t"+"= ");
			System.out.println(population.get(i));
			
			
		}
		System.out.println("There are " + population.size() + " countries and their corresponding populations in this hash map");

		System.out.println(population.containsKey("United Kingdom"));
		
		System.out.println(population.containsValue(330000000));
	}

}
