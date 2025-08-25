package Java8_Assignement;
import java.util.*;

public class WordCounter_A6 {

	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Ramesh");
	names.add("Suresh");
	names.add("Senthil");
	names.add("Rajesh");
	names.add("Ram");
	names.add("Bheem");
	
	long sorted = names.stream().filter(n->n.length()>5).count();
	System.out.println("Total count is"+ " "+ sorted);
	

	}

}
