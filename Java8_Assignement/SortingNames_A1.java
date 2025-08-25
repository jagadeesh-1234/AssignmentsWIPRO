package Java8_Assignement;

import java.util.*;

public class SortingNames_A1 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Ravi");
	list.add("Raju");
	list.add("Rao");
	list.add("Ramesh");
	list.add("Rakesh");
	
	list.sort((a,b) -> a.compareTo(b));
	for(String List : list) {
		System.out.println(List);
	}
		}

}
