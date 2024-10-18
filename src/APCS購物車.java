import java.util.*;
public class APCSÁÊª«¨® {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pro1=sc.nextInt();
		int pro2=sc.nextInt();
		int people=sc.nextInt();
		int sus=0;
		int bruh=0;
		int total=0;
		
		for(int i=0;i<people;i++) {
			while(true) {
				int j=sc.nextInt();
				if(j==pro1) {
					sus++;
				}
				else if(j==pro2) {
					bruh++;
				}
				else if(j==pro1*-1) {
					sus--;
				}
				else if(j==pro2*-1) {
					bruh--;
				}
				if(j==0) {
					break;
					
				}
			}
			if(sus>0&&bruh>0) {
				total++;
			}
			sus=0;
			bruh=0;
		}
		System.out.println(total);

	}

}
