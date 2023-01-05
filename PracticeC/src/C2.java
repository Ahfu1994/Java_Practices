
public class C2 {
	public static void main(String[] args) {
		recursive2(10,10);

	}

	public static void recursive(int num) {
		if (num == 0) {
			return;
		}
		System.out.print("x");
		recursive(num - 1);
	}
	public static void recursive2(int num, int line) {
		if (line == 0) {
			return;
		}
		recursive(num);
		System.out.println();
		recursive2(num,line-1);
	}
	
}
