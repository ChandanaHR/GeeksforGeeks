You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

  class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n = arr.length;
        int newn = n+1;
        int[] newarr = new int[newn+1];
        for(int i=0;i<n;i++) {
            newarr[arr[i]] = 1;
        }
        for(int i=1;i<newn+1;i++) {
            if(newarr[i]==0) {
                return i;
            }
        }
        return -1;
    }
}
