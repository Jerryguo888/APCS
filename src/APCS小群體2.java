import java.util.*;
public class APCS§p∏s≈È2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int total=0;
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			if(arr[i]==-1) {
				continue;
			}
			int sus=arr[i];
			arr[i]=-1;
			while(sus!=-1) {
				int bruh=arr[sus];
				arr[sus]=-1;
				sus=bruh;
			}
			total++;
		}
		System.out.println(total);
		
	}

}
