import java.util.*;
public class APCS¤äÂI¤Á³Î {
	
	//no good
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int findN=sc.nextInt();
		int arr[]=new int[s+1];
		int arrP[]=new int[s+1];
		for(int i=1;i<=s;i++) {
			arr[i]=sc.nextInt();
			arrP[i]=arr[i];
		}
		for(int i=1;i<=s;i++) {
			arrP[i]=arrP[i-1]+arrP[i];
		}
		long a=find(arr,arrP,findN,1,s);
		System.out.println(a);
	}
	static long find(int[] arr,int[] arrP,int num,int head,int tail) {
		int a=Arrays.binarySearch(arr, num);
		if(a<0) {
			a=-1*(a+1);
			int m=(tail+head)/2;
			long x;
			long y;
			if(m%2!=0) {
				x=find2(arr,tail,m-1);
				y=find2(arr,m+1,head);
			}else {
				x=find2(arr,tail,m);
				y=find2(arr,m+2,head);
			}
			if(x>y) {
				return y;
			}else {
				return x;
			}
		}
		else {
			if(arr.length<3) {
				return arrP[a];
			}
			else if(arrP[a]>arrP[arrP.length-1]-arrP[a-1]) {
				return arrP[arrP.length-1];
			}else if(arrP[a]<arrP[arrP.length-1]-arrP[a-1]){
				return arrP[a];
			}else {
				return arrP[a-1];
			}
		}
	}
	static long find2(int arr[],int head,int tail) {
		if(tail-head+1==1) {
			return arr[tail];
		}else if(tail-head+1==2){
			return arr[tail]+arr[head];
		}	
		else {
		
			int m=(tail+head)/2;
			long x;
			long y;
			if(m%2!=0) {
				x=find2(arr,tail,m-1);
				y=find2(arr,m+1,head);
			}else {
				x=find2(arr,tail,m);
				y=find2(arr,m+2,head);
			}

			if(x>y) {
				return y;
			}else {
				return x;
			}
		}
	}
}
