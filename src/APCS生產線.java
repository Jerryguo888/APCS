import java.util.*;
public class APCS¥Í²£½u {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int t=sc.nextInt();
		int machine[]=new int[m+1];
		int task[]=new int[m+1];
		for(int i=1;i<=t;i++) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			task[a]+=c;
			task[b+1]+=-c;
		}
		for(int i=1;i<=m;i++) {
			task[i]=task[i-1]+task[i];
		}
		for(int i=1;i<=m;i++) {
			machine[i]=sc.nextInt();
		}
		Arrays.sort(task);
		Arrays.sort(machine);
		long total=0;
		int ti=	task.length-1;
		int ai=1;
		for(int i=1;i<=m;i++) {
			total+=machine[ti]*task[ai];
			ai++;
			ti--;
		}
		System.out.println(total);
	}

}
