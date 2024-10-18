import java.util.*;
public class APCS動線安排 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int times=sc.nextInt();
		char arr[][]=new char[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=' ';
			}
		}
		int max=0;
		int last=0;
		
		for(int i=0;i<times;i++) {
			int r=sc.nextInt();
			int c=sc.nextInt();
			int sus=sc.nextInt();
			if(sus==0) {
				put(arr,r,c,a,b);
			}
			else if(sus==1) {
				remove(arr,r,c,a,b);
			}
			
			for(int x=0;x<times;x++) {
				int total=0;
				for(int f=0;f<a;f++) {
					for(int j=0;j<b;j++) {
						if(arr[f][j]!=' ') {
							total++;
						}
					}
				}
				if(max==0 || total>max) {
					max=total;
				}
				if(x==times-1) {
					last=total;
				}
			}
			for(int l=0;l<a;l++) {
				for(int j=0;j<b;j++) {
					System.out.print(arr[l][j]);
				}
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println(max);
		System.out.println(last);
		
										
	}
	static void put(char arr[][],int r,int c,int a,int b) {
		arr[r][c]='@';
		//up
		if(r>0) {
			for(int i=r-1;i>=0;i--) {
				if(arr[i][c]=='@') {
					for(int j=r-1;j>i;j--) {
						if(arr[j][c]=='-') {
							arr[j][c]='+';
						}
						else if(arr[j][c]==' ')
							arr[j][c]='|';
					}
					break;
				}
			}
		}
		
		//down
		if(r<a-2) {
			for(int i=r+1;i<a;i++) {
				if(arr[i][c]=='@') {
					for(int j=r+1;j<i;j++) {
						if(arr[j][c]=='-') {
							arr[j][c]='+';
						}
						else if(arr[j][c]==' ')
							arr[j][c]='|';
					}
					break;
				}
			}
		}
		
		//left
		if(c>0) {
			for(int i=c-1;i>=0;i--) {
				if(arr[r][i]=='@') {
					for(int j=c-1;j>i;j--) {
						if(arr[r][j]=='|') {
							arr[r][j]='+';
						}
						else if(arr[r][j]==' ')
							arr[r][j]='-';
					}
					break;
				}
			}
		}
		
		//right
		if(c<b-2) {
			for(int i=c+1;i<b;i++) {
				if(arr[r][i]=='@') {
					for(int j=c+1;j<i;j++) {
						if(arr[r][j]=='|') {
							arr[r][j]='+';
						}
						else if(arr[r][j]==' ')
							arr[r][j]='-';
					}
					break;
				}
			}
		}
		
	}
	static void remove(char arr[][],int r,int c,int a,int b) {
		arr[r][c]=' ';
		//up
		if(r>0) {
			for(int i=r-1;i>=0;i--) {
				if(arr[i][c]=='@') {
					for(int j=r-1;j>i;j--) {
						if(arr[j][c]=='+') {
							arr[j][c]='-';
						}
						else if(arr[j][c]=='|')
							arr[j][c]=' ';
					}
					break;
				}
			}

		}
		//down
		if(r<a-2) {
			for(int i=r+1;i<a;i++) {
				if(arr[i][c]=='@') {
					for(int j=r+1;j<i;j++) {
						if(arr[j][c]=='+') {
							arr[j][c]='-';
						}
						else if(arr[j][c]=='|')
							arr[j][c]=' ';
					}
					break;
				}
			}
		}
		
		//left
		if(c>0) {
			for(int i=c-1;i>=0;i--) {
				if(arr[r][i]=='@') {
					for(int j=c-1;j>i;j--) {
						if(arr[r][j]=='+') {
							arr[r][j]='|';
						}
						else if(arr[r][j]=='-')
							arr[r][j]=' ';
					}
					break;
				}
			}
		}
		
		//right
		if(c<b-2) {
			for(int i=c+1;i<b;i++) {
				if(arr[r][i]=='@') {
					for(int j=c+1;j<i;j++) {
						if(arr[r][j]=='+') {
							arr[r][j]='|';
						}
						else if(arr[r][j]=='-')
							arr[r][j]=' ';
					}
					break;
				}
			}
		}
		
	}
}