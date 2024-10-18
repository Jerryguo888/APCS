import java.util.*;

public class APCS¯x°}Á`©M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int sarr[][] = new int[a][b];
		int barr[][] = new int[c][d];

		int num = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				sarr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				barr[i][j] = sc.nextInt();
			}
		}

		int totalSarr = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				totalSarr += sarr[i][j];
			}
		}
		int x = 0;
		int y = 0;
		int all = 0;
		int t = 0;
		int s=-1;
		int arr=0;
		int v=-1;
		while (true) {
			int sus[][] = new int[a][b];

			if (d - x < b) {
				y++;
				x = 0;
			}
			if (c - y < a) {
				break;
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					sus[i][j] = barr[i + y][j + x];
				}
			}
			x++;

			int total = 0;
			t=0;
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					t += sus[i][j];
					if (sarr[i][j] != sus[i][j]) {
						total++;
					}
				}
			}
			
	
			
			if (total > num) {
				continue;
			} else if (total <= num) {
				all++;
			}
			
			int l;
			l=Math.abs(t-totalSarr);
			if(v==-1 || l<v) {
				v=l;
			}
		
			
		}
		
		if (all == 0) {
			System.out.println(all);
			System.out.println("-1");
		} else {
			System.out.println(all);
			System.out.println(Math.abs(v));
		}

	}

}