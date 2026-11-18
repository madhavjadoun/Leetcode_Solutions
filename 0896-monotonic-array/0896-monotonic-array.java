class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean t=true;
        boolean f=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                t=false;
            }
              if(nums[i]<nums[i-1]){
                f=false;
            }
        }
        return t||f;
    }
}