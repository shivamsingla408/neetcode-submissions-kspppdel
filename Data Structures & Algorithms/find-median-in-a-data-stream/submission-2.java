class MedianFinder {
    private double med;
    private List<Integer> arr;
    public MedianFinder() {
        med =0;
        arr = new ArrayList<>();
    }
    
    public void addNum(int num) {
        arr.add(num);
    }
    
    public double findMedian() {
        int n = arr.size();
        Collections.sort(arr);
        double ans=0;
        if(n%2==0){
          ans = arr.get((n-1)/2)+arr.get(n/2);
          ans = ans/2;
        }
        else
        ans = arr.get(n/2);

        return ans;
    }
}
