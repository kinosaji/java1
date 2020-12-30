package study2020;

import java.util.Scanner;

public class CodeUp1027 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	
	String[] A = a.split("\\.");
	
	System.out.printf("%s-%s-%s",A[2],A[1],A[0]);
	
	
	}

}
// 메타문자가아닌 문자로 split regex 에 입력할때는 ex:\\. 로 입력하자! 주의!