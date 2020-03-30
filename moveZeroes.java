class Solution {
    public void moveZeroes(int[] nums) {
        // initialize pointers
        int index = 0;
        int nonZero = 0;
        
        // PSEUDOCODE
        // example [0, 1, 0, 3, 12] -> [1, 3, 12, 0, 0] 
        
        // step1 - [0, 1, 0, 3, 12] -> [1, 0, 3, 12, 0]
        
        // step2 - [1, 0, 3, 12, 0] -> [1, 3, 12, 0, 0]
        
        while(nonZero < nums.length) {
            if (nums[nonZero] == 0) {
                // increment nonZero index
                nonZero++;
            } else if (index==nonZero) {
                index++;
                nonZero++;
            } else if (nums[nonZero] > 0 || nums[nonZero] < 0) {
                // set number at current index to nonzero number
                nums[index++] = nums[nonZero];
                
                // set number at nonzero index to 0
                nums[nonZero++] = 0;
            }
        }
        
    }
}