import java.util.*;
public class APCS線段覆蓋長度 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int total=0;
		int arr[]=new int[10000000];
		for(int i=0;i<a;i++) {
			int d1=sc.nextInt();
			int d2=sc.nextInt();
			for(int j=d1+1;j<=d2;j++) {
				arr[j]=1;
			}
			
		}
		for(int i=0;i<10000000;i++) {
			if(arr[i]==1) {
				total++;
			}
		}
		
		System.out.println(total);
	}

}
