class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
            if(i<j && j<k && (nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff)){
                c++;
            }
        }
        }
        }
        return c;
    }
}