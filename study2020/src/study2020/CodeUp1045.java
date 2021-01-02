package study2020;

import java.util.Scanner;

public class CodeUp1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	double c = (double)a/b;
		System.out.printf("%.2f",c); // %.2f 두번쨰 소수점까지 표시 (3.33)

	}

}
