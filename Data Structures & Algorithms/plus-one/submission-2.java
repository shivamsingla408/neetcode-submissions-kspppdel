class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
        return digits;
        }
       
        else{
            int[] ans = new int[digits.length];
            boolean flag = true;
            for(int i=0;i<digits.length;i++){
              if(digits[i]!=9){
                flag=false;
              }
            }
            if(flag==true){
                int ans1[] = new int[digits.length+1]; 
                ans1[0]=1;
                for(int i=0;i<digits.length;i++){
                    ans1[i+1]=0;
                }
                return ans1;
            }
            else{
            for(int i=digits.length-1;i>=0;i--){
                while(digits[i]==9 ){
                     ans[i]=0;
                     i--;
                }
                ans[i]=digits[i]+1;
                i--;
                while(i>=0){
                    ans[i] = digits[i];
                    i--;
                }
            }
            return ans;
        }
        }
    }
}
