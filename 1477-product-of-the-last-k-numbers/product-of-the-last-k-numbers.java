class ProductOfNumbers {
    List<Integer> arr;
    public ProductOfNumbers() {
        arr = new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int n = arr.size();
        int prod = 1;
        if(!arr.isEmpty())
        {
            while(n > 0 && k > 0){
            prod *= arr.get(--n);
            k--;
        }
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */