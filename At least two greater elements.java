
// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        Arrays.sort(arr);
        long[] result = new long[arr.length - 2];
        for (int i = 0; i < arr.length - 2; i++)
        {
            result[i] = arr[i];
        }
        return result;
    }
}
