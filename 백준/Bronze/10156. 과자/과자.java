import java.util.Scanner;
	
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int N = in.nextInt();
		int M = in.nextInt();
		int price = 0;
		
		if((K*N)-M>0) {
			price = (K*N)-M;
		}
		else {
			price = 0;
		}
		
		System.out.println(price);
	}
}