import java.util.*;
public class APCS­×¸É³òÄæ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<a;i++) {
			if(arr[i]==0) {
				if(arr[0]==0 ) {
					total=arr[1];
				}
				if(arr[a-1]==0) {
					total=total+arr[a-2];
				}
			}
		}
		for(int i=1;i<a;i++) {
			if(arr[i-1]>arr[i+1]) {
				total+=arr[i+1];
			}
			else if(arr[i-1]==arr[i+1]){
				total+=arr[i+1];
			}
			else {
				total+=arr[i-1];
			}
		}
		System.out.println(total);
		
	}

}
