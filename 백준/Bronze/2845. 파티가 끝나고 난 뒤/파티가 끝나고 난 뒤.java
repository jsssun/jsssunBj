import java.util.Scanner;
	
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L=in.nextInt();
		int P=in.nextInt();
		int[] arr=new int[5];

		for(int i=0;i<5;i++) {
			arr[i]=in.nextInt();
			System.out.print(arr[i]-(P*L)+" ");
		}
	}
}