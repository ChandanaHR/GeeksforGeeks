Given an array arr. Find the majority element in the array. If no majority exists, return -1.

A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [3, 1, 3, 3, 2]
Output: 3
Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than n/2 times, so there is no majority element.

  class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int n = arr.length;
        if(n==1) {
            return arr[0];
        }
        int times = n/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > times) {
                return key;
            }
        }
        return -1;
    }
}

Accuracy 50%
