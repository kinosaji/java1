package study2020;

import java.util.Scanner;

public class CodeUp1035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = Integer.parseInt(a,16); // valueOf �ε� ����
		
		System.out.printf("%o",b);
	}

}
