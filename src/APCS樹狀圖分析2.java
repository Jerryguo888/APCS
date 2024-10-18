import java.util.*;
public class APCS¾ðª¬¹Ï¤ÀªR2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int head=sc.nextInt();
		int father[]=new int[head+1];
		int tall[]=new int[head+1];
		int haveWalked[]=new int[head+1];
		int top=0;
		ArrayList<Integer> list= new ArrayList<>();
		int x=0;
		for(int i=1;i<=head;i++) {
			int a=sc.nextInt();
			if(a==0) {
				list.add(i);
			}
			for(int j=0;j<a;j++) {
				int b=sc.nextInt();
				father[b]=i;
			}
			if(father[i]==0) {
				top=i;
			}
		}
		
//		for(int i=1;i<=head;i++) {
//			System.out.print(father[i]+"¡@");
//		}	
		
		for(int i=0;i<list.size();i++) {
			int high=0;
			int dad=list.get(i);
			while( dad!=0) {
				high=high+findTall(father,dad);
				dad=father[dad];
		
				if(high>tall[dad] && dad!=0) {
					tall[dad]=high;
				}
			}
	
		}
//		System.out.println();
		long total=0;
		for(int i=1;i<=head;i++) {
//			System.out.print(tall[i]+" ");
			total+=tall[i];
		}
		System.out.println(top);
		System.out.println(total);

	}
	static int findTall(int arr[],int son) {
		int father=arr[son];
		int tall=0;
		if(father !=0) {
			tall++;
			
			return tall;
		}else {
			return 0;
		}
	}
//	static int findFather(int arr[],int son) {
//		int father=arr[son];
//
//		return father;
//	}

}
