public class Solution {
    public static void nBinaryTriangle(int n) {
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ;j<i+1 ;j++){
                System.out.print((i+j+1)%2+" ");
                 }
            System.out.println();
        }
    }
}
