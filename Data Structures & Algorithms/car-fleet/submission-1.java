class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int res = 1;
        Car[] c = new Car[n];
        for(int i=0;i<n;i++){
            c[i] = new Car(position[i],(double)(target-position[i])/speed[i]); 
        }
        Arrays.sort(c,(a,b)->b.pos-a.pos);
        double prev = c[0].time;
        for(int i=1;i<n;i++){
             if(c[i].time>prev){
                res++;
                prev = c[i].time;
             }
        }
        return res;
    }
    class Car{
    public int pos;
    public double time;
    Car(int pos,double time){
        this.time=time;
        this.pos=pos;
    }
}
}

