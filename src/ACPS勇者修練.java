import java.util.*;
public class ACPS«iªÌ­×½m {
	public static void main(String[] args) {
	     
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ori[][]=new int[m+1][n+2];
        int sus[][]=new int[m+1][n+2];
        int bruh[][]=new int[m+1][n+2];
        int max=0;
        for(int i=1;i<=m;i++) {
      	  for(int j=1;j<=n;j++) {
      		  ori[i][j]=sc.nextInt();
      	  }
        }
        for(int i=1;i<=m;i++) {
      	  for(int j=1;j<=n;j++) {
      		  int a=ori[i-1][j]+ori[i][j];
      		  int b=sus[i][j-1]+ori[i][j];
//      		  if(u[i][j]>r[i][j]) {
//      			  ori[i][j]=u[i][j];
//      		  }else {
//      			  ori[i][j]=r[i][j];
//      		  }
      		  sus[i][j]=Math.max(a,b);
      	  }
      	  for(int j=n;j>=1;j--) {
      		  int c=ori[i-1][j]+ori[i][j];
      		  int d=bruh[i][j+1]+ori[i][j];
//      		  if(u[i][j]>r[i][j]) {
//      			  ori[i][j]=u[i][j];
//      		  }else {	
//      			  ori[i][j]=r[i][j];
//      		  }
      		  bruh[i][j]=Math.max(c, d);
      		  ori[i][j]=Math.max(bruh[i][j], sus[i][j]);
      		  if(i==m) {
      			  if(ori[i][j]>max) {
      				  max=ori[i][j];
      			  }
      		  }
      	  }
        }
        System.out.println(max);
   }

}
