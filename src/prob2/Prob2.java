package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		System.out.println("5개의 숫자를 입력하세요.");
		for(int i=0; i<5;i++){
		int num1 = scanner.nextInt();
		intArray[i]=num1;
		System.out.println("");
		}
		
		
		
//		int num2 = scanner.nextInt();
//		System.out.println("");
//		int num3 = scanner.nextInt();
//		System.out.println("");
//		int num4 = scanner.nextInt();
//		System.out.println("");
//		int num5 = scanner.nextInt();
//		System.out.println("");


		/* 배열에 저장된 정수 값 더하기 */
		for(int j=0;j<5;j++){
			sum = sum+intArray[j];
		}

		/* 출력 */
		System.out.println("평균은 "+sum/5+" 입니다.");
		/* 자원정리 */
		scanner.close();
	}
}
