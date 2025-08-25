package CoreandCollections;
import java.util.Scanner;

public class Avg_A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		System.out.println("Enter the 5 Numbers");
		for(int i=0;i<5;i++) {
			num[i] = sc.nextInt();
			if(num[i]<10) {
				num[i]= num[i]*2;
			}
			sum = sum+num[i];
		}
		
		double average = sum/5.0;
		System.out.println("Average is"+ " "+average);
		
	}

}
