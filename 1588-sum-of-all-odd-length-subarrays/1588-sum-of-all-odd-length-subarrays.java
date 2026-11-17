class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int g=0;
        for(int i=0;i<arr.length;i++){
            int h=0;
            for(int j=i;j<arr.length;j++){
                h+=arr[j];
                    if((j-i+1)%2!=0){
                        g+=h;
                    }
                }}
        return g;
    }
}