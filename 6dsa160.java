class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        int no = n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val>no) {
                res.add(key);
            }
        }
        return res;
    }
}
