class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int result=longest(nums,nums.length);
        return nums.length-result;
    }
    public static int longest(int[] nums,int n){
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int[] dy=new int[n];
        dy[n-1]=1;
        for(int i=n-2;i>=0;i--){
            dy[i]=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    dy[i]=Math.max(dy[i],dy[j]+1);
                }
            }
        }
        int result=0;
        for(int i=0;i<n;i++){
            if(dp[i]==1 || dy[i]==1){
                continue;
            }
            result=Math.max(result,dp[i]+dy[i]-1);
        }
        return result;
    }
}
