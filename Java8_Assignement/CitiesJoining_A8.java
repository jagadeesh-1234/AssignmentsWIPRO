package Java8_Assignement;
import java.util.*;
import java.util.stream.Collectors;

public class CitiesJoining_A8 {
	public static void main(String[] args) {
		List<String> city = new ArrayList<>();
		city.add("Vizag");
		city.add("Vellore");
		city.add("Goa");
		city.add("Hyderabad");
		city.add("Chennai");
		city.add("Coimbattore");
		city.add("Banglore");
		
		List<String> Cities = city.stream().collect(Collectors.toList());
		System.out.println("Cities list is:"+ " "+Cities);
}
}