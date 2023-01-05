
public class F6 {

	public static void main(String[] args) {
		int count1 = 0;
		for (int i = 1;; i++) {
			int count2 = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					count2++;
				}
			}
			if (count2 == 2) {
				count1++;
				System.out.println(i);
			}
			if (count1 == 100) {
				return;
			}
			
		}


	}

}
