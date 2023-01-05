import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = Math.min(num1, num2);
		for (int i = max; i > 0; i--) {
			if (num1%i == 0 && num2%i ==0) {
				System.out.println(i);
				return ;
			}
			
		}
	}

}
