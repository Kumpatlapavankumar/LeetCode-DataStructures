class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return peak(arr,0,arr.length-1);
    }
    public int peak(int[] arr,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==high || arr[mid+1]<arr[mid])){
                return mid;
            }else if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
