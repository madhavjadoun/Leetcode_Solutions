class Solution {
    public int sumOfSquares(int[] nums) {
        int g=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                g=g+(nums[i-1]*nums[i-1]);
            }
        }
        return g;
    }
}