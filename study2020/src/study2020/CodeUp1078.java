package study2020;

import java.util.Scanner;

public class CodeUp1078 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int b = scan.nextInt();
	int sum = 0;
	for(int i=0; i<=b; i++) { //10이하일때 출력 후
		if(i%2==0) {
			sum = sum +i;
		}
	}
	System.out.println(sum); //프로그램은 위에서 부터 아래로 내려가며 읽는다는걸 유념하자
}
}