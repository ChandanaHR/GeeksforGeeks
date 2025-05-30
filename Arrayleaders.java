You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

Examples:

Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
Input: arr = [10, 4, 2, 4, 1]
Output: [10, 4, 4, 1]
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side

  class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        res.add(arr[0]);
         for(int i=1;i<n;i++) {
             if(arr[i]<res.get(res.size()-1)) {
                 res.add(arr[i]);
             }
             else {
                 while(!res.isEmpty() && arr[i]>res.get(res.size()-1)) {
                     res.remove(res.size()-1);
                 }
                 res.add(arr[i]);
             }
         }
         return res;
    }
}
