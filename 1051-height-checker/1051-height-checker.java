class Solution {
    public int heightChecker(int[] h) {
        int a[]=new int[h.length];
        int g=0;
        int l=0;
        for(int i=0;i<h.length;i++){
            a[g++]=h[i];
    }
    Arrays.sort(a);
    for(int i=0;i<a.length;i++){
        if(a[i]!=h[i]){
            l++;
        }
    }
    return l;
}}