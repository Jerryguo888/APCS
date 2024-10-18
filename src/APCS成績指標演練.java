import java.util.*;
public class APCS成績指標演練 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int c=-1;
		for(int i=0;i<a;i++) {
			if(c==-1) {
				System.out.print(arr[i]);
				c=0;
			}
			else {
				System.out.print(" "+arr[i]);
			}
		}
		
		System.out.println();
		
		int good=0;
		int bad=0;
		for(int i=0;i<a;i++) {
			if(arr[i]>=60) {
				if(arr[i]<good||good==0) {
					good=arr[i];
				}
			}
			else {
				if(arr[i]>bad||bad==0) {
					bad=arr[i];
				}
			}
		}
		if(bad==0) {
			System.out.println("best case");
			System.out.println(good);
		}
		else if(good==0) {
			System.out.println(bad);
			System.out.println("worst case");
		}
		else {
			System.out.println(bad);
			System.out.println(good);
		}

	}

}
