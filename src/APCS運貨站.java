import java.util.*;
public class APCS運貨站 {
	

	    public static void main(String[] args) {

	        Box[] boxes = new Box[5];
	        for (int i = 0; i < boxes.length; i++) {
	            boxes[i] = new Box();
	        }
	        // A
	        boxes[0].h = 4;
	        boxes[0].size = 4;
	        boxes[0].width = new int[] { 1, 1, 1, 1 };
	        // B
	        boxes[1].h = 1;
	        boxes[1].size = 3;
	        boxes[1].width = new int[] { 3 };
	        // C
	        boxes[2].h = 2;
	        boxes[2].size = 4;
	        boxes[2].width = new int[] { 2, 2 };
	        // D
	        boxes[3].h = 2;
	        boxes[3].size = 4;
	        boxes[3].width = new int[] { 1, 3 };
	        // E
	        boxes[4].h = 3;
	        boxes[4].size = 5;
	        boxes[4].width = new int[] { 1, 2, 2 };

	        Scanner sc = new Scanner(System.in);

	        int r = sc.nextInt();
	        int c = sc.nextInt();

	        int n = sc.nextInt();

	        int[] container = new int[r] ;
	        int skip = 0 ;
	        int total = 0 ;
	        for (int i = 0; i < n; i++) {
	            String t = sc.next();
	            int row = sc.nextInt();
	            Box box = null;
	            switch (t) {
	                case "A":
	                    box = boxes[0];
	                    break;
	                case "B":
	                    box = boxes[1];
	                    break;
	                case "C":
	                    box = boxes[2];
	                    break;
	                case "D":
	                    box = boxes[3];
	                    break;
	                case "E":
	                    box = boxes[4];
	                    break;
	            }

	            int end = 0;
	            // 加上每一層的寬
	            for (int h = 0; h < box.width.length; h++) {
	                //int w = boxes[box].width[h]+container[h+row];
	                // 計算每一排最末端的位置
	                int w = box.width[h]+container[h+row];
	                if( w>end){
	                    end = w ; // 記住最後面
	                }
	            }
	           
	            // 判斷是否加入
	            if( end <= c ){
	                // 加入
	                for (int h = 0; h < box.width.length; h++) {                   
	                    container[h+row] = end ;
	                }
	                total += box.size ;
	            }else{
	                // 丟掉
	                skip++ ;
	            }

	        }
	    
	        total = r*c-total ;
	        System.out.println(total+" "+skip);
	    
	    }

	}



class Box {
	int h;
	int[] width;
	int size;
}