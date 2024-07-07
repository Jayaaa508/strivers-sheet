public class Solution {
    public static void nStarTriangle(int n) {
      for ( int i =0 ; i<=2*n-1 ; i++){
          int s = i;
          if(i>n) s = 2*n-i ;
          for(int j= 1 ; j<=s ;j++){
              System.out.print("*");
          }
          System.out.println();
      }
      
    }
}
