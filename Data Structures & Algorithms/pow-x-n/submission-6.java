class Solution {
    public double myPow(double x, int n) {
        long N =n;
        double ans =x;
        if(x==1 || (x==-1 && n%2==0) )return 1;
        if(x==-1)return -1;
        if(n==0)return 1;
        for(long i=0;i<N-1;i++){
            ans*=x;
        }
        if(n<0){
            for(long i=N;i<=0;i++){
                ans = ans/x;
                if(ans==0)return 0;
            }
            return ans;
        }
        return ans;
    }
}
