import java.util.*;
public class APCStest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.next();
		int arr[]=new int[10];
		int d=0;
		int all=1;
		boolean sus=Character.isUpperCase(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))==sus) {
				all++;
			}
			else {
				
				sus=Character.isUpperCase(str.charAt(i));
				arr[d]=all;
				all=1;
				d++;
			}
		}
		arr[d]=all;
//		for(int i=0;i<=d;i++) {
//			
//				System.out.print(arr[i]+" ");
//			
//			
//		}
//		System.out.println();
		int now=0;
		int total=0;
		for(int i=0;i<=d;i++) {
			if(arr[i]<a) {
				if(now>total) {
					total=now;
				}
				now=0;
			}
			else if(arr[i]==a) {
				now+=a;
				if(now>total) {
					total=now;
				}
			}
			else if(arr[i]>a) {
				now+=a;
				if(now>total) {
					total=now;
				}
				now=a;
			}
		}
		System.out.println(total);
	}

}
