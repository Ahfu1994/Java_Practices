
public class C1 {

	public static void main(String[] args) {
		recursive(10);

	}
	
	public static void recursive(int num) {
		if (num == 0 ) {
			return ;
		}
		System.out.print("x");
		recursive(num-1);
	}

}
