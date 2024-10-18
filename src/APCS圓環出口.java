import java.util.*;
public class APCS∂Í¿Ù•X§f {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int pts[]=new int[a];
		for(int i=0;i<a;i++) {
			pts[i]=sc.nextInt();
			if(i!=0) {
				pts[i]+=pts[i-1];
			}
		}
		int keys[]=new int[b];
		for(int i=0;i<b;i++) {
			keys[i]=sc.nextInt();
		}
		int pos=0;
		for(int i=0;i<keys.length;i++) {
			int target=keys[i];
			if(pos!=0 ) {
				target+=pts[pos-1];
			}
			if(target>pts[pts.length-1]) {
				target%=pts[pts.length-1];
			}
			pos=Arrays.binarySearch(pts, target);
			if(pos<0) {
				pos=(-1)*(pos+1);
			}
			pos++;
			pos=pos%pts.length;
		}
		System.out.println(pos);
	}

}
