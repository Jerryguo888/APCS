import java.util.Arrays;
import java.util.Scanner;
public class APCS�T���ο�O2 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int a=arr[0];
		int b=arr[1];
		int c=arr[2];
		
		System.out.println();
		if(a==b && b==c) {
			System.out.println("���T����");
		 }	
		else if(a+b<=c) {
			System.out.println("No");
		}
		else if(a*a+b*b<c*c) {
			System.out.println("Obtuse");
			if(a*a+b*b<c*c && a==b || b==c) {
				System.out.println("���y Obtuse");
			}
		}
		else if(a*a+b*b==c*c) {
			System.out.println("Right");
			if(a*a+b*b==c*c && a==b || b==c) {
				System.out.println("���y Right");
			}
		}
		else if(a*a+b*b>c*c) {
			System.out.println("Acute");
			if(a*a+b*b>c*c && a==b || b==c) {
				System.out.println("���y Acute");
			}
		}
		

		
		
	}
	
}
