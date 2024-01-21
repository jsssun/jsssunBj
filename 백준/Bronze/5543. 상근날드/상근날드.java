import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b1=in.nextInt();
		int b2=in.nextInt();
		int b3=in.nextInt();
		int d1=in.nextInt();
		int d2=in.nextInt();
		
		int bur=0;
		int drink=0;
		
		if(b1>b2) {
			if(b2>b3) {
				bur=b3;
			}
			else {
				bur=b2;
			}
		}
		else {
			if(b1>b3) {
				bur=b3;
			}
			else {
				bur=b1;
			}
		}
		
		if(d1>d2) {
			drink=d2;
		}
		else {
			drink=d1;
		}
		int cost=bur+drink-50;
		System.out.println(cost);
	}
}