	import java.util.*;
	public class APCS¦r¦ê¸Ñ½X {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			String num[]=new String[a];
			String arr[]=new String[b];
			
			String arr2="";
			for(int i=0;i<a;i++) {
				num[i]=sc.next();
			}
			String huh=sc.next();
			for(int i=0;i<b;i++) {
				arr[i]=huh.substring(i,i+1);
			}
			int flip=0;
			int z=0;
			for(int i=a-1;i>=0;i--) {
				String sus=num[i];
				arr2="";
				z=0;
				for(int j=0;j<b;j++) {
					int bruh=(int)sus.charAt(b-j-1)-48;
				
					if(bruh==0) {					
						arr2=arr[b-j-1]+arr2;	
					}
					
					else {
						arr2=arr2+arr[b-j-1];	
						z++;
					}
				}
				
					if(z%2!=0) {
						int n=arr2.length()/2;
						if(arr2.length()%2==0) {
							arr2=arr2.substring(n)+arr2.substring(0,n);
						}
						else {
							arr2=arr2.substring(n+1)+arr2.charAt(n)+arr2.substring(0,n);
						}
						
					}
					
				
				for(int o=0;o<b;o++) {
					arr[o]=arr2.substring(o,o+1);
				}
				
			}
			
			for(int i=0;i<b;i++) {
				System.out.print(arr2.charAt(i));
			}
		}
		
	}