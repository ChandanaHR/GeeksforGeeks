Kth Smallest
Difficulty: MediumAccuracy: 35.17%Submissions: 671K+Points: 4Average Time: 25m
Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [2, 3, 1, 20, 15], k = 4 
Output: 15
Explanation: 4th smallest element in the given array is 15.

  class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++) {
            pq.add(arr[i]);
        }
        int count = 0;
        while(!pq.isEmpty()) {
            int item = pq.poll();
            count++;
            if(count == k) {
                return item;
            }
        }
        return -1;
    }
}
Accuracy 50%
