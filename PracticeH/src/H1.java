import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				count++;
			}
			if (count > 0) {
				System.out.println("have");
				return;
			}
		}
		System.out.println("don't have");

	}

}
