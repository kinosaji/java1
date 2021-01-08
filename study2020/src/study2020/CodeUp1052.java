package study2020;

import java.util.Scanner;

public class CodeUp1052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		if(a!=b) { //조건문에서 바로 연산가능
		System.out.println(1);
		}
		else {
			System.out.println(0);

		}
	}
}