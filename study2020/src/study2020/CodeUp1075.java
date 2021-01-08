package study2020;

import java.util.Scanner;

public class CodeUp1075 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		a--;
		while(true) {
			
			if (a==-1) break;
			System.out.println(a);
			a--;
		}
	}
}
