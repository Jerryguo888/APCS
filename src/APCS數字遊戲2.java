import java.util.*;
public class APCS¼Æ¦r¹CÀ¸2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			if(i==a) {
				arr[i]=arr[i]+1;
			}
			if(i==b) {
				arr[i]=arr[i]+1;
			}
			if(i==c) {
				arr[i]=arr[i]+1;
			}
		}
		int f=0;
		int max=arr[9];
		for(int i=8;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max+" ");
		for(int i=9;i>=0;i--) {
			if(arr[i]>0) {
				if(f==0) {
					System.out.print(i);
					f++;
				}
				else {
					System.out.print(" "+i);
				}
			}
		}
	}

}
