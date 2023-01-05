
public class C6 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("-");
			}
			count++;
			for (int j = 0; j < count * 2 - 1; j++) {

				System.out.print("x");
			}
			System.out.println();
		}
	}

}
