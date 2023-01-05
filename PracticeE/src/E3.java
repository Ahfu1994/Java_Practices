import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = Math.max(num1, num2);
		int i = max;
		while(true){
			if (i%num1 == 0 && i%num2 == 0) {
				break;
			}
			i++;
		}
		System.out.println(i);
		
	}

}
