package study2020;

import java.util.Scanner;

public class CodeUp1078 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int b = scan.nextInt();
	int sum = 0;
	for(int i=0; i<=b; i++) { //10�����϶� ��� ��
		if(i%2==0) {
			sum = sum +i;
		}
	}
	System.out.println(sum); //���α׷��� ������ ���� �Ʒ��� �������� �д´ٴ°� ��������
}
}