import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mul = 1;
		for (int i = 1; i <= num; i++) {
			mul *= i;
		}
		System.out.println(mul);

	}

}
