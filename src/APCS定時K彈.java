import java.util.*;
public class APCS©w®ÉK¼u {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=N;i++) {
			list.add(i);
		}
		int now=0;
		
		int target=0;
		
		for(int i=0;i<K;i++) {
			target=(now+M-1)%list.size();
			list.remove(target);
			now=target%list.size();
			
			
		}
		System.out.println(list.get(now));
		
		
	}

}
