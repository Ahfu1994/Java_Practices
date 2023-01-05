import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 0.0;
		for (int i = 1; i <= num; i++) {
			sum = sum + 1.0 / Math.pow(i, 2);

		}
//		System.out.println(sum);
		double pi = Math.sqrt(6*sum);
		System.out.println(pi);

	}

}
