class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String st: strs){
            s.append(st.length()).append('#').append(st);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
          List<String> s = new ArrayList<>();
          int i=0;
          while(i<str.length()){
            int index = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,index));
            i = index+1;
            String decoder = str.substring(i,i+length);
            s.add(decoder);
            i = i+length;
        


          }
          return s;
    }
}
