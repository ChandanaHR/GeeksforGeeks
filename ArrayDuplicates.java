Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [0, 3, 1, 2] 
Output: [] 
Explanation: There is no repeating element in the array, so the output is empty.
Input: arr[] = [2]
Output: [] 
Explanation: There is single element in the array. Therefore output is empty.

  class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if(set.contains(arr[i])) {
                res.add(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        return res;
    }
}
Accuracy 100%
