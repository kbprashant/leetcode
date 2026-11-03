class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=0;
        for(int num:nums){
            max=Math.max(num,max);
            sum+=num;
        }
        return max*n-sum;
    }
}
