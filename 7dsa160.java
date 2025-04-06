class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int i=n-1,j=n-2;
        int sum = 0;
        while(i>=0 && j>=0) {
            if(prices[i]>prices[j]) {
                sum += (prices[i]-prices[j]);
            }
            i--;
            j--;
        }
        return sum;
    }
}
