
public class F4 {

	public static void main(String[] args) {
		for (int i = 1;i <= 100; i++) {
			int count2 = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					count2++;
				}
			}
			if (count2 == 2) {
				System.out.println(i);
			}
			
			
		}

	}

}
