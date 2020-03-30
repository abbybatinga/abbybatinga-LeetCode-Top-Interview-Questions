class Solution {
    public int[] plusOne(int[] digits) { 
        
        // Example: [1, 2, 6, 9]
        
        // output should be [1, 2, 7, 0]
        
        // loop through array backwards
        for (int i = digits.length-1; i >= 0; i--) {
            // if last element is not 9, add 1 to it
            if (digits[i] != 9) {
                digits[i]++;
                
                // return array
                return digits;
            } else {
                // last digit becomes 0
                digits[i] = 0;
            }
        }
        
        // create new array of size one greater than digits
        
        // [9] -> [1, 0]
        int[] result = new int[digits.length+1];
        
        // set first element to 1
        result[0] = 1;
        
        return result;
        
    }
}