package study2020;

import java.util.Scanner;

public class CodeUp1050 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a!=b) { //조건문에서 바로 연산가능
		System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}