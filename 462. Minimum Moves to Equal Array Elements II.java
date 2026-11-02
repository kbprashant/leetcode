class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length>>1];
        int minMoves=0;
        for(int num:nums){
            minMoves+=Math.abs(num-median);
        }

        return minMoves;
    }
}
