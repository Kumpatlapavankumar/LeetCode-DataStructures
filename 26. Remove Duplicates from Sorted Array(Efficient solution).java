class Solution {
    public int removeDuplicates(int[] nums) {
        int result=1;
        //donot edit this

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[result]=nums[i];
                result++;
            }
        }
        return result;
    }
}
