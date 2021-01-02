package study2020;

import java.util.Scanner;

public class CodeUp1035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = Integer.parseInt(a,16); // valueOf 로도 가능
		//문자열을 숫자형으로 받았을때 정수로 전환해준다. (Integer.parseInt)
		System.out.printf("%o",b);
		
		

	}

	
}
