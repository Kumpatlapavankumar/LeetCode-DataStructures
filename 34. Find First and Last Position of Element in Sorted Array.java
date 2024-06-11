class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=firstocc(nums,target,low,high);
        int last=lastocc(nums,target,low,high);
        return new int[]{first,last};
    }
    public int firstocc(int[] arr,int target,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                if(mid==0 || arr[mid-1]!=target){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public int lastocc(int[] arr,int target,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                if(mid==high || arr[mid+1]!=target){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
