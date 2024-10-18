import java.util.*;
public class APCS³Ì¤j©M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int [a][b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int total=0;
		int sarr[]=new int [a];
		for(int i=0;i<a;i++) {
			int max=0;
			for(int j=0;j<b;j++) {
				if(max==0 ||arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			total+=max;
			sarr[i]=max;
		}
		System.out.println(total);
		
		int s=0;
		int h=0;
		for(int i=0;i<a;i++) {
			if(total%sarr[i]==0 && s==0) {
				System.out.print(sarr[i]);
				s=1;
			}
			else if(total%sarr[i]==0 && s!=0)
					System.out.print(" "+sarr[i]);
			
			else
				h++;
		}
		if(h==a) {
			System.out.println("-1");
		}
	}
}
