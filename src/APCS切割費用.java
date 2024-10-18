import java.util.*;
public class APCS¤Á³Î¶O¥Î {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int L=sc.nextInt();
		int cuts[]=new int[n+1];
		for(int i=0;i<n;i++) {			
			int cutLoc=sc.nextInt();
			int pos=sc.nextInt();
				
			cuts[pos]=cutLoc;	
		}

		
		ArrayList<Integer> cutList=new ArrayList<>();
		cutList.add(0);
		cutList.add(L);
		long total=0;
		for(int i=1;i<n+1;i++) {
			int cut=cuts[i];
			int a =Collections.binarySearch(cutList, cut);
			if(a<0) {
				a=(-1)*(a+1);
			}
			cutList.add(a,cut);
			total+=cutList.get(a+1)-cutList.get(a-1);
			
		}
		System.out.println(total);
		
	}

}
