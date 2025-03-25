class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        int m = a.length;
        int n = b.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<m;i++) {
            map1.put(a[i],map1.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<n;i++) {
            map2.put(b[i],map2.getOrDefault(b[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map2.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(map1.containsKey(key)) {
                if(map1.get(key)<value) {
                    return false;
                }
            }
            else if(!map1.containsKey(key)) {
                return false;
            }
        }
        return true;
    }
}
