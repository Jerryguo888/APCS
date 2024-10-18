import java.util.*;
public class APCS²q®± {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int bro=sc.nextInt();
		int times=sc.nextInt();
		int sis[]=new int [times];
		for(int i=0;i<times;i++) {
			sis[i]=sc.nextInt();
		}
		int bruh=0;
		for(int i=0;i<times;i++) {
			if(bruh==2) {
				if(sis[i-1]==5) {
					bro=2;
				}
				if(sis[i-1]==2) {
					bro=0;
				}
				if(sis[i-1]==0) {
					bro=5;
				}
				bruh=0;
			}
			if(sis[i]==0) {
				if(bro==0) {
					
					System.out.print(bro+" ");
					bro=sis[i];
					bruh++;
				}
				else if(bro==5) {
					System.out.print(bro+" "+": Won at round "+(i+1));
					break;
				}
				else {
					System.out.print(bro+" "+": Lost at round "+(i+1));
					break;
				}
				
			}
			else if(sis[i]==2) {
				if(bro==2) {
					
					System.out.print(bro+" ");
					bro=sis[i];
					bruh++;
				}
				else if(bro==0) {
					System.out.print(bro+" "+": Won at round "+(i+1));
					break;
				}
				else {
					System.out.print(bro+" "+": Lost at round "+(i+1));
					break;
				}
				
			}
			if(sis[i]==5) {
				if(bro==5) {
					
					System.out.print(bro+" ");
					bro=sis[i];
					bruh++;
				}
				else if(bro==2) {
					System.out.print(bro+" "+": Won at round "+(i+1));
					break;
				}
				else {
					System.out.print(bro+" "+": Lost at round "+(i+1));
					break;
				}
				
			}
			if(i==times-1 && bro==sis[i])
				System.out.print(": Drew at round "+times);
		}
		
		
		
	}

}
