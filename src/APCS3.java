import java.util.*;
public class APCS3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a+1];
		int totalLength[]=new int[a+1];
		int walkThrough[]=new int[a+1];
		int length=0;
		for(int i=1;i<=a;i++) {
			int num=sc.nextInt();
			if(num==0) {
				totalLength[i]=0;
			}
			else{
				
				for(int x=0; x<num;x++) {
					int num2=sc.nextInt();
					arr[num2]=i;
				}
			}
		}
		for(int i=1;i<a+1;i++) {
			int now=arr[i];
			if(totalLength[i]==0 || now!=0) {
				int next=arr[now];
				arr[now]=-1;
				now=next;
				length++;
			}
		}
		for(int i=1;i<=a;i++) {
			System.out.print(totalLength[i]+" ");
		}
	        	        
	}
	

}
