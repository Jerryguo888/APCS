import java.util.*;
public class APCS程式交易 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int time=sc.nextInt();
		int sus=sc.nextInt();
		int total=0;
		int arr[]=new int[time];
		for(int i=0;i<time;i++) {
			arr[i]=sc.nextInt();
		}
		int huh=1;
		int lastone=arr[0];
		for(int i=1;i<time;i++) {
			int a=arr[i];
			if(a>=lastone+sus && huh==1) {
				total+=a-lastone;
				lastone=a;
				huh=0;
			}
			if(huh==0) {
				if(a<=lastone-sus) {
					lastone=a;
					huh=1;
				}
			}

		}
		System.out.println(total);
		

	}

}
/*
6
10
30 20 45 38 60 32
*/