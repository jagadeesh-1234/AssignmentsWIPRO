package SolidPrinciples;

class Maid{
	void Cleaning() {
		System.out.println("Maid is Cleaning");
	}
}

	class Driver{
		void Driving() {
			System.out.println("Driver is Driving");
		}
	}
public class SRP {

	public static void main(String[] args) {
		Maid m = new Maid();
		m.Cleaning();
		Driver d = new Driver();
		d.Driving();

	}
	


}
