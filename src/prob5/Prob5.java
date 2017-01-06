package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// Randomize

			int count = 0;
			int pnum = 0;
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			int number = random.nextInt(100) + 1;
			System.out.println("수를 정했습니다. 맞추어 보세요");
			do{
				count+=1;
				int a=1;
				int b=100;
				pnum = scanner.nextInt();
				if(pnum < number) {
					
					a=pnum;
				}
				if(pnum > number) {
					
					b=pnum;
				}
				System.out.println(a+"-"+b);
			    System.out.print(count+">>");

			}while (pnum== number);
			System.out.print("다시 하시겠습니까? (y/n)");
			String answer = scanner.nextLine();

			if (answer.equals("y") == true) {
			}
		}
	}


		
	
