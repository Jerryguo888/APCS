import java.util.*;
public class APCS¦¨ÁZ«ü¼Ðsuperfast {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sus=sc.nextInt();
		int arr[]= new int [sus];
		for(int i=0;i<sus;i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.print(arr[0]);
		for(int i=1;i<sus;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		if(arr[0]>=60) {
			System.out.println("best case");
			System.out.println(arr[0]);
		}
		else if(arr[sus-1]<60) {
			System.out.println(arr[sus-1]);
			System.out.println("worst case");
		}
		else {
			int min=0;
			int max=0;
			for(int i=0;i<sus;i++) {	
				if(arr[i]<60) {
					if(arr[i]>min || min==0) {
						min=arr[i];
					}
				}
				if(arr[i]>=60) {
					if(arr[i]<max || max==0) {
					max=arr[i];
					}
				}
			}
			System.out.println(min);
			System.out.println(max);
		}
	}

}
