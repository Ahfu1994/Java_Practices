
public class C8 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("-");
			}
			count++;
			if (count % 2 == 0) {
				for (int j = 1; j <= count * 2 - 1; j++) {

					System.out.print(j);
				}
			} else {
				for (int j = count * 2 - 1; j > 0; j--) {
					System.out.print(j);
				}
			}

			System.out.println();
		}

	}

}
