import java.util.Scanner;
	
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] car = new int[5];
		int count = 0;
		
		for(int i=0;i<5;i++) {
			car[i] = in.nextInt();
			if(car[i]==n) {
				count++;
			}
		}
		System.out.println(count);

	}
}