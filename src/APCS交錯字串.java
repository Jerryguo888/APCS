import java.util.*;
public class APCS¥æ¿ù¦r¦ê {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String arr=sc.next();
		int bruh[]=new int [arr.length()];
		for(int i=0;i<arr.length();i++) {
			if(Character.isUpperCase(arr.charAt(i))) {
				bruh[i]=1;
			}
		}
		
		int huh=bruh[0];
		int sus=1;
		int k=0;
		for(int i=1;i<arr.length();i++) {    
			if(bruh[i]==huh) {
				sus++;
			}
			else {
				bruh[k]=sus;
				sus=1;
				k++;
				huh=bruh[i];
			}
		}
		bruh[k]=sus;
		
		int total=0;
		int sum=0;
		for(int i=0;i<=k;i++) {
			if(bruh[i]<a) {
				if(sum>total) {
					total=sum;
				}
				sum=0;
			}
			else if(bruh[i]==a) {
				sum=sum+a;
				if(sum>total) {
					total=sum;
				}
			}
			else if(bruh[i]>a) {
				sum=sum+a;
				if(sum>total) {
					total=sum;
				}
				sum=a;
			}
		}
		System.out.println(total);
	}



}


//a:97 A:65