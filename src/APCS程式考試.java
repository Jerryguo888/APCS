import java.util.Scanner;
public class APCS程式考試 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]=new int[n][2];
		int time=0;
		int max=-2;
		int total=0;
		int sus=0;
		for(int i=0;i<n;i++) {
			int timenow=sc.nextInt();
			int score=sc.nextInt();
			if(score==-1) {
				sus++;
			}
			if(score>max) {
				max=score;
				time=timenow;
			}
		}
		total=max-n-(sus*2);
		if(total>=0) {
			System.out.println(total+" "+time);
		}
		else {
			System.out.println("0"+" "+time);
		}
	}

}
