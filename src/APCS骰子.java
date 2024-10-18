import java.util.*;
public class APCS»ë¤l {


	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] dice= {{0,3,0,0},
				   	   {5,1,2,6},
			           {0,4,0,0},
			           {0,6,0,0}};
		
		int[][][] ds=new int[n][4][4];
		for(int i=0;i<ds.length;i++) {
			ds[i]=new int[][]{{0,3,0,0},
				   			  {5,1,2,6},
				   			  {0,4,0,0},
				   			  {0,6,0,0}};
		}
		
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(b<0) {
				if(b==-1) {
					front(ds[a-1]);
				}
				if(b==-2) {
					right(ds[a-1]);
				}
			}else {
				a= a-1;
				b= b-1;
				int[][] tmp=ds[a];
				ds[a]=ds[b];
				ds[b]=tmp;
			}
				
		}
		
		for(int i=0;i<ds.length;i++) {
			if(i==0) {
				System.out.print(ds[i][1][1]);
			}
			else {
				System.out.print(" "+ds[i][1][1]);
			}
		}
		
		
		
	}
	static void front(int[][] dice) {
		int tmp = dice[3][1];
		dice[3][1] = dice[2][1];
		dice[2][1] = dice[1][1];
		dice[1][1] = dice[0][1];
		dice[0][1] = tmp;
		
//		dice[1][3]=dice[3][1];
	}
	static void right(int[][] dice) {
		int tmp = dice[1][3];
		dice[1][3]=dice[1][2];
		dice[1][2]=dice[1][1];
		dice[1][1]=dice[1][0];
		dice[1][0]=tmp;
		
//		dice[3][1]=dice[1][3];
	}
	
}


