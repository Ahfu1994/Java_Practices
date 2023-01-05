import java.util.Iterator;
import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 0.0;
		for (int i = 1; i <= num; i++) {
			sum = sum + 1.0 / i;

		}
		System.out.println(sum);

	}

}
