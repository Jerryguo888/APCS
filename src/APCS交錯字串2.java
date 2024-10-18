import java.util.Scanner;
public class APCS¥æ¿ù¦r¦ê2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		String sus=sc.next();
		
		int [] arr=new int [sus.length()];
		
		for(int i=0;i<sus.length();i++) {
			
				arr[i]=1;
			
		}
		
		int c=1;
		int d=0;
		boolean bruh=Character.isUpperCase(sus.charAt(0));
		
			
				
				for(int i=1;i<sus.length();i++) {
					if(Character.isUpperCase(sus.charAt(i))==bruh) {
						c++;
					}
					else {
						arr[i]=c;
						bruh=Character.isUpperCase(sus.charAt(i));
						c=1;
						d++;
					}
				}
			arr[d]=c;
			for(int i=0;i<sus.length();i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			int ans=0;
			c=0;
			for(int i=0;i<d;i++) {
				if(a>arr[i]) {
					if(d>ans)
						ans=d;
					c=0;
				}
				else if(a==arr[i]) {
					c+=a;
					if(c>ans)
						ans=c;
				}
				else if(a<arr[i]) {
					c+=a;
					if(c>ans) {
						ans=c;
					}
				}
				c=a;
			}
		System.out.println(ans);
			//System.out.println((int)'b');
	}



}


//a:97 A:65