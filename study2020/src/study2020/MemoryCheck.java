package study2020;

public class MemoryCheck {

		public static void main(String[] args) {
			Runtime.getRuntime().gc(); 
			// 가비지컬렉션으로 보다 더 정확하게 측정
			long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
			System.out.println("used memory is" + used + " bytes");
		}
	}

	

