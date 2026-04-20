class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i =0;
        int j= arr.length-1;
        while(i<=j){
            while(!alpha(arr[i]) && i<j){
               i++;
            }
            while(!alpha(arr[j]) && i<j){
               j--;;
            }
            if(Character.toLowerCase(arr[i])==Character.toLowerCase(arr[j])){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean alpha(char c){
        if(c>='A' && c<='Z')return true;
        else if(c>='a' && c<='z')return true;
        else if(c>='0' && c<='9')return true;
        else return false;
    }
}
