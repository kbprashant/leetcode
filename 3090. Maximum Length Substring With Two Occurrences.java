class Solution {
    public int maximumLengthSubstring(String s) {
        int[] frequency = new int[26];
        int maxLength=0;

        int left=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            frequency[c]++;

            while(frequency[c]>2){
                int leftCurrent=s.charAt(left)-'a';
                frequency[leftCurrent]--;
                left++;
            }

            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}