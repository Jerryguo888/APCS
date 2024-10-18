
import java.util.*;
public class APCS¼Æ¦r¹CÀ¸ {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a=0;
		int arr[]=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int total=1;
		
		for(int i=0;i<2;i++) {
			
			if(arr[i]==arr[i+1]) {
				total++;
			}
		}
		System.out.print(total);
		
		if(total==3) {
			System.out.print(" "+arr[0]);
		}
		else if(total==2) {
			System.out.print(" "+arr[2]+" "+arr[0]);
		}
		else {
			System.out.print(" "+arr[2]+" "+arr[1]+" "+arr[0]);
		}
		
	}

}