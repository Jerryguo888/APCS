import java.util.*;
public class APCSÅÞ¿è¹Bºâ¤l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=sc.nextInt();
		
		if(a==0&&b==0&&result==0) {
			System.out.println("AND\r\n"
							 + "OR\r\n"
							 + "XOR");
		}
		else if(a!=0&&b==0&&result==0 || a==0&&b!=0&&result==0) {
			System.out.println("AND");
		}
		else if(a!=0&&b!=0&&result==0) {
			System.out.println("XOR");
		}
		else if(a!=0&&b==0&&result==1 || a==0&&b!=0&&result==1) {
			System.out.println("OR\r\n"
					 		 + "XOR");
		}
		else if(a!=0&&b!=0&&result==1) {
			System.out.println("AND\r\n"
					 		 + "OR");
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
