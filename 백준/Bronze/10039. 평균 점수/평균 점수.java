import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			score[i]=in.nextInt();
			if (score[i]<40) {
				score[i]=40;
			}
			sum+=score[i];
		}
		int avg=sum/5;
		System.out.println(avg);
	}
}