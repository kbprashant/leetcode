class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int smallestTwo=nums[n-1]-nums[2];
        int smallestAndLargest=nums[n-2]-nums[1];
        int largestTwo=nums[n-3]-nums[0];

        return Math.min(smallestTwo,Math.min(smallestAndLargest,largestTwo));
    }
}
