class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int in1= numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                int in2 = numbers[j];
                if(i==j)continue;
                if(target<(in1+in2))break;
                if(in1+in2==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                }
            }

        }
        return ans;
    }
}
