
public class B10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (i%3 == 0 && i%5 == 0 && i%7 == 0) {
				continue;
			}
			else if (i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
			else if (i%3 == 0 && i%7 == 0) {
				System.out.println(i);
			}
			else if (i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
		}

	}

}
