//한 단어가 입력된다.(단, 단어의 길이는 50자 이하이다.) infomatics가 입력된다
//(스캐너 사용)
//문자를 50개 저장하기 위해서는 char data[51] 로 선언하면 된다.
//(어레이 사용)
//char data[51]="";
//scanf("%s", data);
//@@@@ string을 받아서 char로 저장한후 for문으로 문자들을 순서대로 내보낸다 @@@@//
//를 실행하면, data[51] 에 한 단어가 저장된다.
package study2020;

import java.util.Scanner;

public class CodeUp1021 {

public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//    String A = sc.next();
//
//
//    for(int i = 0; i < 51; i++ ) {
//    char a = A.charAt(i);
//    System.out.print(a);
	
	
//	public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	String A = scan.next();
//	
//	char[] a = A.toCharArray();
//	for (int i=0; i < 1; i++) {
//		System.out.print(a[i]);
	Scanner sc = new Scanner(System.in);
	String A = sc.next();
	System.out.printf("%s",A);
	
}
}
