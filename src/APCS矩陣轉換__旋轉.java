
import java.util.Scanner;
public class APCS矩陣轉換__旋轉 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[b][a]; 
		//左轉
		for(int h=0;h<b;h++) {
			for(int k=0;k<a;k++) {
				arr2[h][k]=arr[k][b-h-1];
			}
		}
		arr=arr2;
		//右轉
//		for(int h=0;h<b;h++) {
//			for(int k=0;k<a;k++) {
//				arr2[h][k]=arr[a-k-1][h];
//			}
//		}
//		arr=arr2;
		System.out.println();
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

