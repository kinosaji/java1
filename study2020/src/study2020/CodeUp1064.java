package study2020;

import java.util.Scanner;

public class CodeUp1064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	
		int d = (a<b ? a:b)<c ? (a<b ? a:b):c; // (��ȣ�ȿ� �ĵ��� �ᱹ �����ϳ���)
		
		System.out.println(d);
	}
	}