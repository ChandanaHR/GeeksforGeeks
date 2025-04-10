class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int currentsum = arr[0];
        int maxsum = arr[0];
        for(int i=1;i<n;i++) {
            currentsum = Math.max(arr[i],currentsum+arr[i]);
            maxsum = Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
}
