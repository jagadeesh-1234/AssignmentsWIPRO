package Java8_Assignement;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyMapper_A10 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Wipro");
		names.add("Rahul");
		names.add("Ramesh");
		names.add("Wipro");
		names.add("Ramesh");
		names.add("Wipro");
		
		Map<String, Long> nameCount = names.stream()
	            .collect(Collectors.groupingBy(name -> name,LinkedHashMap::new, Collectors.counting()));
		System.out.println(nameCount);
	}

}
