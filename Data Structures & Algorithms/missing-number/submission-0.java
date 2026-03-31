class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int value=0;
        int sum = n*(n+1)/2;
        for(int i=0;i<n;i++){
            value=value+nums[i]; 
        }

        int missingValue=sum-value;

        return missingValue;
    }
}
