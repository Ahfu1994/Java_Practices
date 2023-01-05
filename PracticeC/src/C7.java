
public class C7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("-");
			}
			count++;
			for (int j = 1; j <= count; j++) {

				System.out.print(j);
			}
			if (count > 1) {
				for (int j = count - 1; j > 0; j--) {

					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
