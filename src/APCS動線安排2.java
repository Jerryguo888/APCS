import java.util.Scanner;
public class APCS動線安排2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int times=sc.nextInt();
		int farm[][]=new int[a][b];
		int arr[][]=new int[times][3];
		for(int i=0;i<times;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=-1;
		for(int i=0;i<times;i++) {
			int total=0;
			if(arr[i][2]==0) {
				put(arr[i][0],arr[i][1],a,b,farm);
			}
			else {
				remove(arr[i][0],arr[i][1],a,b,farm);
			}
			for(int x=0;x<a;x++) {
				for(int j=0;j<b;j++) {
					if( farm[x][j]!=0) {
						total++;
					}
				}
			}
			for(int x=0;x<a;x++) {
				for(int j=0;j<b;j++) {
					if( max==-1 || total>max) {
						max=total;
					}
				}
			}
		}
		int all=0;
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				//System.out.print(farm[i][j]+"   ");
				if( farm[i][j]!=0) {
					all++;
				}
			}
			//System.out.println();
		}
		//System.out.println();
		//System.out.println("最大"+max);
		//System.out.println("最後一個"+all);
		
		System.out.println(max);
		System.out.println(all);
										
	}
	public static void put(int a,int b,int aLength,int bLength,int arr[][]){
		
		if(arr[a][b]==0) {
			arr[a][b]=1;
		}
		//判斷有沒有線
		else {
			if(a<=aLength && a>=0) {
				for(int i=a+1;i<aLength;i++) {
					if(arr[i][b]==1) {
						for(int j=a+1;j<i;j++) {
							if(arr[j][b]==-2 || arr[j][b]==-3) {
								continue;
							}
							else
								arr[j][b]=0;
						}
						
						break;
					}
				
				}
				for(int i=a-1;i>=0;i--) {
					if(arr[i][b]==1) {
						for(int j=a-1;j>i;j--) {
							if(arr[j][b]==-2 || arr[j][b]==-3) {
								continue;
							}
							else
								arr[j][b]=0;
						}
						
						break;
					}
				
				}
				
			}
			if(b<=bLength && b>=0) {
				for(int i=b+1;i<bLength;i++) {
					if(arr[a][i]==1) {
						for(int j=b+1;j<i;j++) {
							if(arr[a][j]==-1 || arr[a][j]==-3) {
								continue;
							}
							else
								arr[a][j]=0;
						}
						
						break;
					}
				
				}
				for(int i=b-1;i>=0;i--) {
					if(arr[a][i]==1) {
						for(int j=b-1;j>i;j--) {
							if(arr[a][j]==-1 || arr[a][j]==-3) {
								continue;
							}
							else
								arr[a][j]=0;
						}
						
						break;
					}
				
				}
		}
			
	}	
		
		//接線
		if(a<=aLength && a>=0) {
			for(int i=a+1;i<aLength;i++) {
				if(arr[i][b]==1) {
					for(int j=a+1;j<i;j++) {
						if(arr[j][b]==0) {
							arr[j][b]=-1;
						}
						if(arr[j][b]==-2) {
							arr[j][b]=-3;
						}
							
						
						
					}
					break;
				}
			
			}
			for(int i=a-1;i>=0;i--) {
				if(arr[i][b]==1) {
					for(int j=a-1;j>i;j--) {
						
						if(arr[j][b]==0) {
							arr[j][b]=-1;
						}
						if(arr[j][b]==-2) {
							arr[j][b]=-3;
						}
						
					}
					break;
				}
			
			}
			
		}
		if(b<=bLength && b>=0) {
			for(int i=b+1;i<bLength;i++) {
				if(arr[a][i]==1) {
					for(int j=b+1;j<i;j++) {
						if(arr[a][j]==0) {
							arr[a][j]=-2;
						}
						if(arr[a][j]==-1) {
							arr[a][j]=-3;
						}
							
						
					}
					break;
				}
			
			}
			for(int i=b-1;i>=0;i--) {
				if(arr[a][i]==1) {
					for(int j=b-1;j>i;j--) {
						
						if(arr[a][j]==0) {
							arr[a][j]=-2;
						}
						if(arr[a][j]==-1) {
							arr[a][j]=-3;
						}
						
					}
					break;
				}
			
			}
			
		}
	}
	public static void remove(int a,int b,int aLength,int bLength,int arr[][]){
		arr[a][b]=0;
		
		if(a<=aLength && a>=0) {
			
			if(a<=aLength && a>=0) {
				for(int i=a+1;i<aLength;i++) {
					if(arr[i][b]==1) {
						for(int j=a+1;j<i;j++) {
							if(arr[j][b]==-2 || arr[j][b]==-3) {
								continue;
							}
							else
								arr[j][b]=0;
						}
						
						break;
					}
				
				}
				for(int i=a-1;i>=0;i--) {
					if(arr[i][b]==1) {
						for(int j=a-1;j>i;j--) {
							if(arr[j][b]==-2 || arr[j][b]==-3) {
								continue;
							}
							else
								arr[j][b]=0;
						}
						
						break;
					}
				
				}
				
			}
			if(b<=bLength && b>=0) {
				for(int i=b+1;i<bLength;i++) {
					if(arr[a][i]==1) {
						for(int j=b+1;j<i;j++) {
							if(arr[a][j]==-1 || arr[a][j]==-3) {
								continue;
							}
							else
								arr[a][j]=0;
						}
						
						break;
					}
				
				}
				for(int i=b-1;i>=0;i--) {
					if(arr[a][i]==1) {
						for(int j=b-1;j>i;j--) {
							if(arr[a][j]==-1 || arr[a][j]==-3) {
								continue;
							}
							else
								arr[a][j]=0;
						}
						
						break;
					}
				
				}
			}	
		}	
	}
}








