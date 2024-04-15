class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length<2){
                return 0;
        }
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product=(nums[i]-1)*(nums[j]-1);
                result=Math.max(result,product);
            }
        }
        return result;
    }
}
