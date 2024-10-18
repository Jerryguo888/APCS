import java.util.*;
public class APCS函數運算式求值 {
	static int bruh=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[]=sc.nextLine().split(" ");
		int a=getNumber(arr);
		System.out.println(a);
	}
	static int getNumber(String[] arr) {
		bruh++;
		String s=arr[bruh];

		if(s.equals("f")) {
			return 2*getNumber(arr)-3;
		}else if(s.equals("g")) {
			return 2*getNumber(arr)+getNumber(arr)-7;
		}else if(s.equals("h")) {
			return 3*getNumber(arr)-2*getNumber(arr)+getNumber(arr);
		}else {
			return Integer.parseInt(s);
		}
	
		
	}
}
