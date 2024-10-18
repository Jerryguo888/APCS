import java.util.*;
public class APCS¬å¾ð {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		tree[] trees=new tree[n+2];
		int total=0;
		int max=0;
		trees[0]=new tree();
		trees[0].pos=0;
		trees[0].pre=-1;
		trees[0].next=1;
		for(int i=1;i<=n;i++) {
			tree t = new tree();
			t.pos=sc.nextInt();
			t.pre=i-1;
			t.next=i+1;
			trees[i]=t;
		}
		
		for(int i=1;i<=n;i++) {
			trees[i].height=sc.nextInt();
		}
		trees[n+1]=new tree();
		trees[n+1].pos=l;
		trees[n+1].pre=n;
		trees[n+1].next=-1;
		
		
		for(int i=1;i<=n;) {
			tree here=trees[i];
			tree preT=trees[here.pre];
			tree nextT=trees[here.next];

			while(here.height<=here.pos-preT.pos||here.height<=nextT.pos-here.pos) {
				if(here.height>max) {
					max=here.height;
				}
				total++; 
				preT.next=here.next;
				nextT.pre=here.pre;
				 if(here.pre==0) {
					break;
				}
				here=trees[here.pre];
				preT=trees[here.pre];
				nextT=trees[here.next];
			}
			i=here.next;
		}
		System.out.println(total);
		System.out.println(max);
		
	}

}
class tree {
	int pos;
	int pre;
	int next;
	int height;
}