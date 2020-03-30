class Solution {
    public void rotate(int[] nums, int k) {
        // original list - [1,2,3,4,5,6,7] k = 3
        
        
        // reverse entire list - [7,6,5,4,3,2,1]
        reverse(nums, 0, nums.length-1);
        
        // reverse first k numbers - [5,6,7,4,3,2,1]
        reverse(nums, 0, k-1);
        
        // reverse nums.length-k numbers - [5,6,7,1,2,3,4]
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        
        // while condition - start < end
        while (start < end) {
            // keep variable being overwritten
            int temp = nums[start];
            
            // replace start with end
            nums[start] = nums[end];
            
            // replace end with temp
            nums[end] = temp;
            
            // increment start
            start++;
            
            // decrement end
            end--;
        }
    }
    
}