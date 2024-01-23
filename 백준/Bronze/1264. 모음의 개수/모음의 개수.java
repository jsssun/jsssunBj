import java.util.Scanner;
	
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String s="";
		
		while(true) {
			s = in.nextLine().toLowerCase();
			if(s.equals("#")) {
				break;
			}
			String arr[] = s.split("");
			for(int i=0;i<s.length();i++) {
				if(arr[i].equals("a")||arr[i].equals("e")||arr[i].equals("i")||arr[i].equals("o")||arr[i].equals("u")) {
					count++;
				}
			}
			System.out.println(count);
			count=0;
		}
	}
}