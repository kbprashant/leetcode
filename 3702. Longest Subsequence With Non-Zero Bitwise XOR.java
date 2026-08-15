class Solution {
    public int longestSubsequence(int[] nums) {
        int zeroCount=0;
        int totalXOR=0;

        int n=nums.length;

        for(int i:nums){
            totalXOR^=i;
            if(i==0){
                zeroCount++;
            }
        }

        if(totalXOR!=0) return n;
        else if(zeroCount==nums.length) return 0;
        
        return n-1;
    }
}