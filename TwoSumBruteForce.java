//Java Solution to the Two Sum Problem (Brute Force Approach O(n^2))
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j}; //returns matches in array format
                }
            }
        }
        return new int[]{-1,-1}; // represents no match found
    }
}
