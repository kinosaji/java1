package study2020;

import java.util.Scanner;

public class CodeUp1058 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		
		if(c==0) { // 이항연산자
		System.out.println(1);
		}
		else {
			System.out.println(0);

		}
	}
}