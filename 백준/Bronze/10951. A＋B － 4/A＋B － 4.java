import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(x+y);
		}
		in.close();
	}
}