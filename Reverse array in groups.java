class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        int last = n-1;
        int b=0,c=1;
        int l=0,r=0;
        for(l=0,r=k-1;r<n;l=(++b)*k,r=((++c)*k)-1) {
            //System.out.print(l+" "+r+" ");
            while(l<r) {
            long temp = arr.get(l);
            arr.set(l,arr.get(r));
            arr.set(r,temp);
            l++;
            r--;
            }
        }
        if(r>=n) {
            while(l<last) {
                long temp = arr.get(l);
                arr.set(l,arr.get(last));
                arr.set(last,temp);
                l++;
                last--;
            }
        }
    }
}
