import java.util.*;
public class APCS¾÷¾¹¥XèÊ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Event[] evts=new Event[n];
		for(int i=0;i<n;i++) {
			evts[i]=new Event();
			evts[i].start=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			evts[i].end=sc.nextInt();
		}
		Arrays.sort(evts);
		
		
		int[] machine=new int[k];
		for (int i = 0; i < machine.length; i++) {
			machine[i]=-1;
		}
		int evtCnt=0;
		for (Event event : evts) {
			int maxEnd=-2 ;
			int maxMach=-1;
			for (int i = 0; i < machine.length; i++) {
				if(machine[i]<event.start){
					if(machine[i]>maxEnd) {
						maxEnd=machine[i];
						maxMach=i;
					}
				}
			}
			if(maxMach!=-1) {
				evtCnt++;
				machine[maxMach]=event.end;
			}
		}
		System.out.println(evtCnt);
	}
}

class Event implements Comparable<Event>{
	int start;
	int end;
	
	public int compareTo(Event o) {
		
		return this.end-o.end;
	}
}	