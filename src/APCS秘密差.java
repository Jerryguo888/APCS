import java.util.*;
public class APCS¯µ±K®t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int bruh=0;
		int sus=0;
		for(int i=0;i<a.length();i=i+2) {
			bruh=bruh+(int)a.charAt(i)-48;
		}
		for(int i=1;i<a.length();i=i+2) {
			sus=sus+(int)a.charAt(i)-'0';
		}
		System.out.println(Math.abs(sus-bruh));

	}

}
