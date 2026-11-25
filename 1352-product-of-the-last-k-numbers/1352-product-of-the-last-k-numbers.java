class ProductOfNumbers {
    ArrayList<Integer> arr=new ArrayList<>();
    public ProductOfNumbers() {
    
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int g=1;
        for(int i=arr.size()-k;i<arr.size();i++){
            g=g*arr.get(i);
        }
        return g;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */