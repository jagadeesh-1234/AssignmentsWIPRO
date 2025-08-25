package Java8_Assignement;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumberCollector_A7 {

	public static void main(String[] args) {
	List<Integer> num = new ArrayList<>();
	num.add(5);
	num.add(12);
	num.add(14);
	num.add(11);
	num.add(20);
	num.add(22);
	num.add(19);
	num.add(40);
	
	List<Integer> EvenNumbers = num.stream()
									.filter(n->n%2==0)
									.collect(Collectors.toList());
	System.out.println("The Even numbers are:" + " "+ EvenNumbers);
	
	

	}

}
