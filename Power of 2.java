class Solution {
    // Function to c
    //heck if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        // code here
        for(int i = 0;i<n;i++){
          if((int)Math.pow(2,i) == n){
              return true;
          }
      }
      return false;
    }
