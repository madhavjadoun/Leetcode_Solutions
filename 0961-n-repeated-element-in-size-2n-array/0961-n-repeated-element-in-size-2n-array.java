class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length/2;
        int g=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j:map.keySet()){
            if(map.get(j)==n){
                g=j;
            }
        }
        return g;
    }
}