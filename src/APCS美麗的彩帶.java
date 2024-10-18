import java.util.*;
public class APCS¬üÄRªº±m±a {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n+m];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=n;i<m+n;i++) {
			arr[i]=arr[i-n];
		}
		
		for(int i=m-1;i<(n+m)-1;i=i+m) {
			for(int j=0;j<i;j++) {
				
			}
		}
	}

}
