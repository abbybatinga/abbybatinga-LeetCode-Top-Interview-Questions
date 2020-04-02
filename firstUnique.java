class Solution {
    public int firstUniqChar(String s) {
        
        // create hashmap to store character and frequency
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        
        // store length of string
        int len = s.length();
        
        // store character and frequency in hashmap
        for (int i = 0; i < len; i++) {
            // get character
            char c = s.charAt(i);
            
            // place character and frequency in map -> increment count each time
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // check for first non-repeating character
        for (int i = 0; i < len; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // if it doesn't exist, return -1
        return -1;
    }
}