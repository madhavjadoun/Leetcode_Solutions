class Solution {
    public boolean isFascinating(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        String s=""+(n)+(2*n)+(3*n);
        if(s.length()!=9)return false;
        int g=Integer.parseInt(s);
        while(g>0){
            int h=g%10;
            map.put(h,map.getOrDefault(h,0)+1);
            g=g/10;
        }
        for(int x=1;x<=9;x++){
            if(map.getOrDefault(x,0)!=1){
                return false;
            }
        }
        return true;
    }
}