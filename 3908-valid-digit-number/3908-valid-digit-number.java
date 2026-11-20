class Solution {
    public boolean validDigit(int n, int x) {
       boolean f=false;
       int d=0;
       while(n>9){
        int g=n%10;
        if(g==x){
            f=true;
        }
        n=n/10;
       } 
       return f && n!=x;
    }
}