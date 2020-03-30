class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // sort array
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-1; i++) {
            // check if next element is equal to first
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}