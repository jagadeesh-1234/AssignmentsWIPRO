package Java8_Assignement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomFilterChain_A11 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Anisha");
	list.add("Anusha");
	list.add("Akash");
	list.add("Rajesh");
	list.add("Rakesh");
	
	Predicate<String> startsWithA = n -> n.startsWith("A");
	Predicate<String> endsWitha = n -> n.endsWith("a");
	
	 List<String> Names = list.stream()
             .filter(startsWithA.and(endsWitha))
             .collect(Collectors.toList());
	 
	 System.out.println("The namesa are :"+ " " +Names);	

	}}