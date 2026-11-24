class Solution {
    public int getLeastFrequentDigit(int n) {
        int l=Integer.MAX_VALUE;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int g=n%10;
            map.put(g,map.getOrDefault(g,0)+1);
            n=n/10;
        }
        for(int i:map.keySet()){
            if(map.get(i)<l){
                l=map.get(i);
                ans=i;
            }
           else if(map.get(i)==l){
                ans=Math.min(ans, i);
            }
            }
        return ans;
    }}