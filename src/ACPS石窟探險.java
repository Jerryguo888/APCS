import java.util.*;
public class ACPS¥Û¸]±´ÀI {
	static int total=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
		
		
		search(list, 0, 0);
        System.out.println(total);

	}
	static int search(ArrayList<Integer> list, int index, int root) {
        int v = list.get(index);
        if (root > 0 && v > 0) {
            total += Math.abs(v - root);
        }
        if (v == 0) {
            return index + 1;
        } else if (v % 2 == 0) {
            int i2 = search(list, index + 1, v);
            i2 = search(list, i2, v);
            return i2;
        } else {
            int i2 = search(list, index + 1, v);
            i2 = search(list, i2, v);
            i2 = search(list, i2, v);
            return i2;
        }
    }
}
