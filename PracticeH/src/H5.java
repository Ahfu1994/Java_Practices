import java.util.Scanner;

public class H5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]%2 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
