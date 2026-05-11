public class timestamp{
   public  String value;
   public int time;
   timestamp(String value,int time){
    this.value = value;
    this.time = time;
   }
}
class TimeMap {
  Map<String,ArrayList<timestamp>> mp;
    public TimeMap() {
       
        
            mp = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestam) {
        
        if(!mp.containsKey(key)){
            mp.put(key,new ArrayList<timestamp>());
        }
        ArrayList<timestamp> temp = mp.get(key);
        temp.add(new timestamp(value,timestam));
    }
    
    public String get(String key, int timestam) {
        if(!mp.containsKey(key))return "";
        ArrayList<timestamp> temp = mp.get(key);
        String ans = binarys(temp,timestam);
        return ans;
    }
    public String binarys(ArrayList<timestamp> temp,int timestam){
        int l=0;
        int r= temp.size()-1;
        int match =-1;
        int mid=-1;
        while(l<=r){
            mid = (l+r)/2;
            if(temp.get(mid).time<=timestam){
                l = mid+1;
                match =mid;
            }  
            else if(temp.get(mid).time>timestam)r = mid-1;
            
        }
        if(match==-1)
        return "";
        return temp.get(match).value;
    }
}
