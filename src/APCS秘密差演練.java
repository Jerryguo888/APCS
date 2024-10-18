import java.util.*;
public class APCS¯µ±K®tºt½m {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String bruh=sc.next();
		int sus=0;
		int huh=0;
		
		for(int i=0;i<bruh.length();i=i+2) {
			sus=sus+(int)bruh.charAt(i)-48;
		}
		for(int i=1;i<bruh.length();i=i+2) {
			huh=huh+(int)bruh.charAt(i)-48;
		}
		
		int total=huh-sus;
		System.out.println(Math.abs(total));

	}

}
