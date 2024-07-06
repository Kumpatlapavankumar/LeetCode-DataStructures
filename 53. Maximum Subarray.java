class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            max_sum=Math.max(max_sum+nums[i],nums[i]);
            result=Math.max(result,max_sum);
        }
        return result;
    }
}
