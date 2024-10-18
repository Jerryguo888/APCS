import java.util.Scanner;
public class APCS»ë¤l20¤À {
//100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int tasks=sc.nextInt();
		
		int dice[][][]=new int[a+1][3][4];
		int hee[][]= {  {0,3,0,0},
						{5,1,2,6},		
						{0,4,0,0}
									};
		for(int i=1;i<a+1;i++) {
			dice[i]=new int[][]{{0,3,0,0},
	   			  {5,1,2,6},
	   			  {0,4,0,0},
	   			  {0,6,0,0}};;
		}
//		for(int i=0;i<tasks;i++) {
			int num=sc.nextInt();
			int doW=sc.nextInt();
			int arr[][]=new int[3][4];
			arr=dice [num];
			int change[][]=new int[3][4];
			if(doW==-1) {
				int huh=arr[1][0];
				arr[1][0]=arr[1][1];
				arr[1][1]=arr[1][2];
				arr[1][2]=arr[1][3];
				arr[1][3]=huh;
			}
			else if(doW==-2) {
				int sus=arr[1][0];
				arr[1][0]=arr[2][1];
				arr[2][1]=arr[1][2];
				arr[1][2]=arr[0][1];
				arr[0][1]=sus;
			}else {
				change=dice[num];
				dice[num]=dice[doW];
				dice[doW]=change;
			}
//		}
		for(int i=1;i<a+1;i++) {
			if(i==1) {
				System.out.print(dice[i][1][1]);	
			}
			else
				System.out.print(" "+dice[i][1][1]);	
		}
		
	}
}
	