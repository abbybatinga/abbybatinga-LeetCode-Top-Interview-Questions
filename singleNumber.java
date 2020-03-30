class Solution {
  public int singleNumber(int[] nums) {
   
      // create set
      Set<Integer> noDuplicate = new HashSet<Integer>();
      
      // initialize variables
      int sumSet = 0;
      int sumNums = 0;
      
      // iterate through nums array
      for (int num: nums) {
          // add num to set if set doesn't contain it
          if(!noDuplicate.contains(num)) {
              noDuplicate.add(num);
              
              // add num to sumSet
              sumSet += num;
          }
          
          // add each num to sumNums
          sumNums += num;
      }
      
      // return single value = 2*sumSet - sumNums
      return 2*sumSet - sumNums;
      
  }
}