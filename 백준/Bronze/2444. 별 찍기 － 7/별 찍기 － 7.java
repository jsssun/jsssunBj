import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}