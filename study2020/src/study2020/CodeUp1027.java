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
// ��Ÿ���ڰ��ƴ� ���ڷ� split regex �� �Է��Ҷ��� ex:\\. �� �Է�����! ����!