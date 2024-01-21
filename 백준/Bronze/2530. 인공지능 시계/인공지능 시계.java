import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int sec = (C+D)%60;
		int min = (B+((C+D)/60))%60;
		int hour = (A+(B+(C+D)/60)/60)%24;
		
		System.out.println(hour+" "+min+" "+sec);
	}
}