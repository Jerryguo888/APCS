import java.util.*;
public class APCS人力分配 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		
		int sus=sc.nextInt();
		
						
		
		int total=0;
		for(int i=0;i<=sus;i++) {
			int huh1=a1*i*i+b1*i+c1;
			int huh2=a2*(sus-i)*(sus-i)+b2*(sus-i)+c2;
			
			
			if(i==0 || huh1+huh2>total) {
				total=huh1+huh2;
			
			}
		}
		System.out.println(total);
		

	}

}
