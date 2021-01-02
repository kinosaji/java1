package study2020;

import java.util.Scanner;

public class CodeUp1070 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		if (b==12||b==1||b==2) {
		System.out.println("winter");
		}
		else if (b==3||b==4||b==5) {
			System.out.println("spring");
		}
		else if (b==6||b==7||b==8) {
			System.out.println("summer");
		}
		else if (b==9||b==10||b==11) {
			System.out.println("fall");
		}

	}

}
