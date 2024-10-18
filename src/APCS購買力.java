import java.util.*;
public class APCS¡ ∂R§O {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int item=sc.nextInt();
		int dif=sc.nextInt();
		int [] price=new int[3];
		int huh[]=new int[item];
		int a=-1;
		int sus=0;
		int bruh=0;
		for(int i=0;i<item;i++) {
			for(int j=0;j<3;j++) {
				int pro=sc.nextInt();
				price[j]=pro;
				
			}
			Arrays.sort(price);
			
			if(price[2]-price[0]>=dif) {
				sus++;
				bruh=(price[0]+price[1]+price[2])/3;
				huh[i]=bruh;
			}
		}
		System.out.print(sus+" ");
		
		int hee=0;
		
		for(int i=0;i<item;i++) {
			hee+=huh[i];
		}
		System.out.println(hee);
	}

}
