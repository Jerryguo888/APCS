import java.util.*;
public class APCS¹B³f¯¸2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//A
	int [][] Aarr=new int [4][1];
	for(int i=0;i<4;i++) {
		for(int j=0;j<1;j++) {
			Aarr[i][j]=1;
		}
	}
	//B
	int [][] Barr=new int [1][3];
	for(int i=0;i<1;i++) {
		for(int j=0;j<3;j++) {
			Barr[i][j]=1;
		}
	}
	//C
	int [][] Carr=new int [2][2];
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			Carr[i][j]=1;
		}
	}
	//D
	int [][] Darr=new int [2][3];
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			Darr[i][j]=1;
		}
	}
	Darr[0][0]=0;
	Darr[0][1]=0;
	//E
	int [][] Earr=new int [3][2];
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			Earr[i][j]=1;
		}
	}
	Earr[0][0]=0;
	//////
	int a=sc.nextInt();
	int b=sc.nextInt();
	int arr[][]=new int [a][b];
	int times=sc.nextInt();
	int now=0;
	for(int i=0;i<times;i++) {
		String box=sc.next();
		int high=sc.nextInt();
		if(box=="A") {
			A(high,arr,a,b);
		}
		else if(box=="B") {
			B(box,high,arr,a,b,Barr);
		}
		else if(box=="C") {
			C(box,high,arr,a,b,Carr);
		}
		else if(box=="D") {
			D(box,high,arr,a,b,Darr);
		}
		else if(box=="E") {
			E(box,high,arr,a,b,Earr);
		}
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
		
	
	}
	static void A(int high,int arr[][],int a,int b) {
		for(int i=b-1;i>=1;i--) {
			if(arr[high][i]==0 && arr[high+1][i]==0 && arr[high+2][i]==0 &&arr[high+3][i]==0){
				if(arr[high][i-1]==0 && arr[high+1][i-1]==0 && arr[high+2][i-1]==0 &&arr[high+3][i-1]==0) {
					continue;
				}
				else {
					arr[high+3][i]=1;
					arr[high+2][i]=1;
					arr[high+1][i]=1;
					arr[high][i]=1;
				}
			}
			
		}
	}
	static void B(String B,int high,int arr[][],int a,int b,int Barr[][]) {
		
	}
	static void C(String C,int high,int arr[][],int a,int b,int Carr[][]) {
		
	}
	static void D(String D,int high,int arr[][],int a,int b,int Darr[][]) {
		
	}
	static void E(String E,int high,int arr[][],int a,int b,int Earr[][]) {
		
	}
	
	
}
