import java.util.*;
public class APCS³y¦rµ{¦¡ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		
		String s=sc.next();
		char sn[]=new char[k];
		char ans[][]=new char[q][k];
		for(int i=0;i<k;i++) {
			sn[i]=s.charAt(i);
		}
		for(int i=0;i<q;i++) {
			for(int j=0;j<k;j++) {
				int p=sc.nextInt();
				ans[i][p-1]=sn[j];
			}
			for(int j=0;j<k;j++) {
				sn[j]=ans[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(ans[j][i]);
			}
			System.out.println();
		}
	}
}
