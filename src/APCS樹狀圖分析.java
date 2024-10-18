import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class APCS�𪬹Ϥ��R {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        // �����C�Ӹ`�I���W�h
        // index:0 ���ϥΡA�D�رq 1 ���}�l
        int[] parent = new int[n+1] ;

        // �O���`�I�`��
        int[] depth = new int[n+1] ;
        ArrayList<Integer> walkList = new ArrayList<>();
        // �[�J�`�I
        for (int i = 1; i <= n; i++) {
            int iNum = sc.nextInt() ;
            if( iNum==0 ){
                // �ݩ󥽺ݸ`�I
                walkList.add(i) ;
                depth[i]=0; // �`�׳]�� 0
            }else{
                for (int idx = 0; idx < iNum; idx++) {
                    int i2 = sc.nextInt();
                    parent[i2]=i ;
                }
            }
        }

        // traverse map

        int root = -1 ;
        while (!walkList.isEmpty()) {
            int target = walkList.remove(0) ;

            int parentIdx = parent[target];
            if( parentIdx==0){
                root = target;
                continue;
            }
            int d = depth[target]+1 ;
            if( d>depth[parentIdx]){
                depth[parentIdx] = d ;
                walkList.add( parentIdx ) ;
            }
        }

        long totalDepth = 0 ;
        for (int i = 1; i < depth.length; i++) {
            totalDepth+=depth[i] ;
        }
        System.out.println(root);
        System.out.println(totalDepth);


    }
}