package questao01;

public class Main {

	public static void main(String[] args) {

		int n = 6;

		for (int i = 0; i != n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.print("\n");
			System.out.println(i);
		}
	}

}
