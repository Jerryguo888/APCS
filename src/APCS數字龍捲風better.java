import java.util.*;
public class APCSº∆¶r¿s±≤≠∑better {

      public static void main(String[] args) {

 /*         	5
				0
				3 4 2 1 4
				4 2 3 8 9
				2 1 9 5 6
				4 2 3 7 8
				1 2 6 4 3
*/ 
    	  Scanner sc = new Scanner (System.in);
    	  int a=sc.nextInt();
    	  int d=sc.nextInt();
    	  int arr[][]=new int[a][a];
    	  
    	  for(int i=0;i<a;i++) {
    		  for(int j=0;j<a;j++) {
    			  arr[i][j]=sc.nextInt();
    		  }
    	  }
    	  	
    	  int x[]= {-1,0,1,0};
    	  int y[]= {0,-1,0,1};
    	  
    	  int xr=a/2;
    	  int yr=a/2;
    	  
    	  System.out.print(arr[xr][yr]);
    	  
    	  for(int step=1;;step++) {
    		  for(int time=1;time<=2;time++) {
    			  for(int i=0;i<step;i++) {
    				  xr+=x[d];	   
    				  yr+=y[d];
    				  if(xr<0||yr<0||xr==a||yr==a) {
    					  System.out.println();
    					  return;
    				  }
    				 System.out.print(arr[yr][xr]); 
    			  }
    			  d++;
    			  d=d%4; 
    		  }
    		 
    	  }
      }

}