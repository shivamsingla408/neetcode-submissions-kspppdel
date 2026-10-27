class Solution {
    public String firstPalindrome(String[] words) {
         for(String temp : words){
            int i =0;
            int j = temp.length()-1;
            boolean flag = true;
            while(i<=j){
                if(temp.charAt(i)!=temp.charAt(j)){
                    flag = false;
                    break;
                }
                i++;j--;

            }
            if(flag==true)return temp;
         }
         return "";
    }
}
