import java.util.*;
public class APCSº∆¶r¿s±≤≠∑ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int l=1;
		int u=1;
		int d=1;
		int r=1;
		int x,y;
		x=a/2;
		y=a/2;
		if(b==0) {
			System.out.print(arr[x][y]);
			arr[x][y]=-1;
			while(true) {
				for(int i=0;i<l;i++) {
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
							break;
						}
						System.out.print(arr[x][y-1]);
						arr[x][y-1]=-1;
						y=y-1;
					}
					
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
						l++;
						continue;
						}
					}
				
					
				}
				for(int i=0;i<u;i++) {
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
							break;
						}
						System.out.print(arr[x-1][y]);
						arr[x-1][y]=-1;
						x=x-1;
					}
					
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
						u++;
						continue;
						}
					}
					
				}
				for(int i=0;i<r;i++) {
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
							break;
						}
						System.out.print(arr[x][y+1]);
						arr[x][y+1]=-1;
						y=y+1;
					}
					
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
						r++;
						continue;
						}
					}
					
				}
				for(int i=0;i<d;i++) {
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
							break;
						}
						System.out.print(arr[x+1][y]);
						arr[x+1][y]=-1;
						x=x+1;
					}
					
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
						d++;
						continue;
						}
					}
					
				}
			}
			
		}
		if(b==1) {
			System.out.print(arr[x][y]);
			arr[x][y]=-1;
			while(true) {
				for(int i=0;i<u;i++) {
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
							break;
						}
						System.out.print(arr[x-1][y]);
						arr[x-1][y]=-1;
						x=x-1;
					}
					
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
						u++;
						continue;
						}
					}
					
				}
				for(int i=0;i<r;i++) {
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
							break;
						}
						System.out.print(arr[x][y+1]);
						arr[x][y+1]=-1;
						y=y+1;
					}
					
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
						r++;
						continue;
						}
					}
					
				}

				for(int i=0;i<d;i++) {
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
							break;
						}
						System.out.print(arr[x+1][y]);
						arr[x+1][y]=-1;
						x=x+1;
					}
					
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
						d++;
						continue;
						}
					}
					
				}
				for(int i=0;i<l;i++) {
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
							break;
						}
						System.out.print(arr[x][y-1]);
						arr[x][y-1]=-1;
						y=y-1;
					}
					
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
						l++;
						continue;
						}
					}
				
					
				}
				
				
			}
		}
		if(b==2) {
			System.out.print(arr[x][y]);
			arr[x][y]=-1;
			while(true) {
				
				for(int i=0;i<r;i++) {
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
							break;
						}
						System.out.print(arr[x][y+1]);
						arr[x][y+1]=-1;
						y=y+1;
					}
					
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
						r++;
						continue;
						}
					}
					
				}

				for(int i=0;i<d;i++) {
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
							break;
						}
						System.out.print(arr[x+1][y]);
						arr[x+1][y]=-1;
						x=x+1;
					}
					
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
						d++;
						continue;
						}
					}
					
				}
				for(int i=0;i<l;i++) {
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
							break;
						}
						System.out.print(arr[x][y-1]);
						arr[x][y-1]=-1;
						y=y-1;
					}
					
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
						l++;
						continue;
						}
					}
				
					
				}
				for(int i=0;i<u;i++) {
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
							break;
						}
						System.out.print(arr[x-1][y]);
						arr[x-1][y]=-1;
						x=x-1;
					}
					
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
						u++;
						continue;
						}
					}
					
				}
				
				
			}
		}
		if(b==3) {
			System.out.print(arr[x][y]);
			arr[x][y]=-1;
			while(true) {
				
				
				for(int i=0;i<d;i++) {
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
							break;
						}
						System.out.print(arr[x+1][y]);
						arr[x+1][y]=-1;
						x=x+1;
					}
					
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
						d++;
						continue;
						}
					}
					
				}
				for(int i=0;i<l;i++) {
					if(y-1>=0) {
						if(arr[x][y-1]==-1) {
							break;
						}
						System.out.print(arr[x][y-1]);
						arr[x][y-1]=-1;
						y=y-1;
					}
					
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
						l++;
						continue;
						}
					}
				
					
				}
				for(int i=0;i<u;i++) {
					if(x-1>=0) {
						if(arr[x-1][y]==-1) {
							break;
						}
						System.out.print(arr[x-1][y]);
						arr[x-1][y]=-1;
						x=x-1;
					}
					
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
						u++;
						continue;
						}
					}
					
				}
				for(int i=0;i<r;i++) {
					if(y+1<a) {
						if(arr[x][y+1]==-1) {
							break;
						}
						System.out.print(arr[x][y+1]);
						arr[x][y+1]=-1;
						y=y+1;
					}
					
					if(x+1<a) {
						if(arr[x+1][y]==-1) {
						r++;
						continue;
						}
					}
					
				}

				
				
			}
		}
	}

}
