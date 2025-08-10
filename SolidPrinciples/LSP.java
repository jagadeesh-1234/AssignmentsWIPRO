package SolidPrinciples;

interface Bottle{
	void use();
}

class Waterbottle implements Bottle{
	public void use() {
		System.out.println("Used for Water");
	}
}

class JuiceBottle implements Bottle{
	public void use() {
		System.out.println("Used for Juice");
	}
}

public class LSP {

	public static void main(String[] args) {
		Bottle wb = new Waterbottle();
		wb.use();
		Bottle jb = new JuiceBottle();
		jb.use();
		

	}

}
