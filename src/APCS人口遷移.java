import java.util.*;
public class APCS¤H¤f¾E²¾ {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a+2][b+2];
		int k=sc.nextInt();
		int days=sc.nextInt();
		for(int i=0;i<a+2;i++) {
			for(int j=0;j<b+2;j++) {
				arr[i][j]=-3;
			}
		}
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int num[][]=new int[a][b];
		
		for(int i=0;i<days;i++) {
			for(int x=1;x<=a;x++) {
				for(int j=1;j<=b;j++) {
					if(arr[x][j]!=-1) {
						num[x-1][j-1]=arr[x][j]/k;
					}
				}
			}
			
			for(int x=1;x<=a;x++) {
				for(int j=1;j<=b;j++) {
					
						int l=0;
						if( arr[x-1][j]!=-3) {
							if(arr[x-1][j]!=-1) {
								l++;
								arr[x-1][j]+=num[x-1][j-1];
							}
							
						}
						if( arr[x+1][j]!=-3) {
							if(arr[x+1][j]!=-1) {
								l++;
								arr[x+1][j]+=num[x-1][j-1];
							}
	
						}
						if( arr[x][j-1]!=-3) {
							if(arr[x][j-1]!=-1) {
								l++;
								arr[x][j-1]+=num[x-1][j-1];
							}
							
						}
						if(arr[x][j+1]!=-3) {
							if(arr[x][j+1]!=-1) {
								l++;
								arr[x][j+1]+=num[x-1][j-1];
							}
							
						}
						for(int z=0;z<l;z++) {
							arr[x][j]-=num[x-1][j-1];
						}
						
						
					}
					
					
					
					
					
					
					
				
					
					
					
				}
			}
			
			
		
		int min=-10;
		int max=-10;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(min==-10 || arr[i][j]<min) {
					if(arr[i][j]!=-1) {
						min=arr[i][j];
					}
					
				}
				if(max==-10 || arr[i][j]>max) {
					if(arr[i][j]!=-1) {
						max=arr[i][j];
					}
					
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		
	}
}
