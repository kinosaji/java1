package study2020;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp1023 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String db = sc.next();

	StringTokenizer str = new StringTokenizer(db,"//.",false);
	
	while(str.hasMoreTokens()) { //hasmoretoken's'�� �߰�ȣ��!! nextToken����ȯ�ؾ���
	System.out.println(str.nextToken());
		
	}
		
}
}