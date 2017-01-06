package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scanner.nextInt();
		System.out.println("50000원 :" + money/50000 + "개");
		System.out.println("10000원 :" + money%50000/10000+ "개");
		System.out.println("5000원 :" + money%10000/5000 + "개");
		System.out.println("1000원 :" + money%5000/1000 + "개");
		System.out.println("500원 :" + money%1000/500 + "개");
		System.out.println("100원 :" + money%500/100 + "개");
		System.out.println("50원 :" + money%100/50 + "개");
		System.out.println("10원 :" + money%50/10 + "개");
		System.out.println("5원 :" + money%10/5 + "개");
		System.out.println("1원 :" + money%5/1 + "개");
		
		scanner.close();
	}
}