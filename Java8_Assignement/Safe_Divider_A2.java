package Java8_Assignement;

import java.util.Scanner;

public class Safe_Divider_A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		
		if(b==0) {
			System.out.println("Not allowed");
		}
		else {
			System.out.println("Value is" + " " +c);
		}
		
	}
}