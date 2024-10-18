import java.util.*;
public class APCS七言對聯 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();

		for(int i=0;i<a;i++) {
			int c=0;
			int [][] arr=new int[2][7];
			for(int k=0;k<2;k++) {
				for(int j=0;j<7;j++) {
					arr[k][j]=sc.nextInt();
				}
			}
			
			
			if(arr[0][1]==arr[0][3] || arr[0][1]!=arr[0][5]||arr[1][1]==arr[1][3] || arr[1][1]!=arr[1][5]) {
				System.out.print('A');
			}								
			else
				c++;
			if(arr[0][6]!=1 || arr[1][6]!=0) {
				System.out.print('B');
			}
			else
				c++;
			if(arr[0][1]==arr[1][1]||arr[0][3]==arr[1][3]||arr[0][5]==arr[1][5]) {
				System.out.println('C');
			}
			else
				c++;
			
			if(c==3) {
				System.out.println("None");
			}
			
			System.out.println();
		}
	}
}