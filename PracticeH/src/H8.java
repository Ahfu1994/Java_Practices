import java.util.Scanner;

public class H8 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[10];
			double sum = 0.0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum = sum +arr[i];
			}
			System.out.println(sum/arr.length);


	}

}
