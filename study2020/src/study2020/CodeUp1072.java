package study2020;

import java.util.Scanner;

public class CodeUp1072 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		int num[] = new int[length];
		
		for(int i = 0; i<num.length;i++) {
			num[i]=scan.nextInt();
			System.out.println(num[i]);
			
		}
	}
 }
