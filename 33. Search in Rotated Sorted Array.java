class Solution {
    public int search(int[] nums, int target) {
       int  flag=-1;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target){
                flag=i;
                break;
            }
        }
        if(flag==-1){
            return flag;
        }else{
            return flag;
        }
    }
}
