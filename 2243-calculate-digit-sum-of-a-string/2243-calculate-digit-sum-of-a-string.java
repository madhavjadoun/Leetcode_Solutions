class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int g=0;
            for(int j=i;j<Math.min(i+k,s.length());j++){
                char ch=s.charAt(j);
                g=g+(ch-'0');
            }
            sb.append(g);   
            }
            s=sb.toString();
        }
        return s;
    }
}