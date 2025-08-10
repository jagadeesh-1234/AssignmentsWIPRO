package Java8_Assignement;

@FunctionalInterface
interface Greeting
{
	void greet();
	
}

public class Greetings_A3 {

	public static void main(String[] args) {
     
		
		Greeting g= ()->System.out.println("good Mrng");
		g.greet();
	}

}
