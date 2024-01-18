import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		int n = in.nextInt()-1;
		System.out.println(S.charAt(n));
	}
}