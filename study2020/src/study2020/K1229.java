package study2020;

public class K1229 {

		public static void main(String[] args) {
			Runtime.getRuntime().gc(); 
			// �������÷������� ���� �� ��Ȯ�ϰ� ����
			long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
			System.out.println("used memory is " + used + " bytes");
		}
	}

	

