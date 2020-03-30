class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length < 2) {
            return nums.length;
        }
        
        // two pointers - one for unique and one for current
        int unique = 0;
        int current = 1;
        
        while (current < nums.length) {
            if (nums[current] != nums[unique]) {
                // increment unique
                unique++;
                
                // set unique element
                nums[unique] = nums[current];
            }
            
            // increment current
            current++;
        }
        
        // return unique count + 1 bc zero based
        return unique + 1; 
    }
}