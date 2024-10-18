import java.util.*;
class APCS¦¨ÁZ«ü¼Ð {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int min=-1;
		int max=-1;
		for(int i=0;i<a;i++) {
			if(arr[i]>=60) {
				if(arr[i]<max || max==-1)
					max=arr[i];
				
			}
			else {
				if(arr[i]>min || min==-1)
					min=arr[i];
			
		}
		}
		
	
			if(min==-1) {
				System.out.println("best case");
				System.out.print(max);
			}
			else if(max==-1) {
				System.out.println(min);
				System.out.println("worst case");
			}
			else {
				System.out.println(min);
				System.out.println(max);
				
			}
		
	}

}