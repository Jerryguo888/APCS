import java.util.*;
public class APCS¯x°}Âà´« {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[a][b];
		int sus[]=new int [c];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<c;i++) {
			sus[i]=sc.nextInt();
		}
		
		
		for(int i=c-1;i>=0;i--) {
			if(sus[i]==0) {
				int bruh=a;
				a=b;
				b=bruh;
				int rearr[][]=new int [a][b];
				
				for(int h=0;h<a;h++) {
					for(int k=0;k<b;k++) {
						rearr[h][k]=arr[k][a-h-1];
					}
				}
				arr=rearr;
			}
			else {
				for(int m=0;m<a/2;m++) {
					for(int n=0;n<b;n++) {
						int bruh=arr[m][n];
						arr[m][n]=arr[a-m-1][n];
						arr[a-m-1][n]=bruh;
					}
				}
			}
		}
		System.out.println(a+" "+b);
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(j==b-1) {
					System.out.print(arr[i][j]);
				}
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
/*
00  01
10  11
20  21

00  01  02
10  11  12
*/