import java.util.*;
class APCS§p∏s≈È {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total=0;
		int[][] arr=new int[a][b];
		int all[]=new int [a];
		int max=-1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				
				if(max==-1 || arr[i][j]>max) {
					max=arr[i][j];
				}
				
			}
			total+=max;
			all[i]=max;
			max=-1;
		}
		System.out.println(total);
		int ok=0;
		int s=0;
		for(int i=0;i<a;i++) {
			if(total%all[i]==0) {
				if(s==0) {
					System.out.print(all[i]);
					s++;
				}
				else {
					System.out.print(" "+all[i]);
				}
				ok++;
			}
			
		}
		if(ok==0) {
			System.out.println("-1");
		}
	}

}
