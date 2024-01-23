import java.util.Scanner;
	
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L=in.nextInt();
		int B=in.nextInt();
		int A=in.nextInt();
		int C=in.nextInt();
		int D=in.nextInt();
		
		int math=0, kor=0;
		if(B%C!=0) {
			math=L-((B/C)+1);
		}
		else {
			math=L-(B/C);
		}
		
		if(A%D!=0) {
			kor=L-((A/D)+1);
		}
		else {
			kor=L-(A/D);
		}
		
		if(math>kor) {
			System.out.println(kor);
		}
		else {
			System.out.println(math);
		}
		
	}
}