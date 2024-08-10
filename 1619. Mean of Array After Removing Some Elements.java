class Solution {
//Don't edit this code 
    public double trimMean(int[] arr) {
        double length=arr.length*0.05;
        Arrays.sort(arr);
        double sum=0;
        double j=0;
        for(int i=(int)length;i<arr.length-length;i++){
            sum=sum+arr[i];
            j++;
        }
        double m=sum/j;
        return m;
    }
}
