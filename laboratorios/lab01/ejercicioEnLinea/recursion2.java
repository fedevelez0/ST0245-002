@authors Federico Velez, Rafael Villegas, Jose David Gomez
@author ozelentok
@availability https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Recursion-2.java
@version 1

public class recursion2 {

    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }
    public boolean splitArrayHelper(int start, int[] nums, int group1, 
        int group2) {
        if(start >= nums.length)
            return group1 == group2;
    
        if(splitArrayHelper(start+1, nums, group1 + nums[start], group2))
            return true;
    
        if(splitArrayHelper(start+1, nums, group1, group2 + nums[start]))
            return true;
    
        return false;
    }


    public boolean split53(int[] nums) {    
        return sidesAreEqual53(nums, 0, 0);}
    public boolean sidesAreEqual53(int[] nums, int i, int balance){
        if(i == nums.length)
            return (balance == 0);
        if(nums[i] % 5 == 0)
            return sidesAreEqual53(nums, i + 1, balance + nums[i]);
        if(nums[i] % 3 == 0)
            return sidesAreEqual53(nums, i + 1, balance - nums[i]);
        if(sidesAreEqual53(nums, i + 1, balance + nums[i]))
            return true;
        return sidesAreEqual53(nums, i + 1, balance - nums[i]);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(target == 0)
          return true;
      if(start >= nums.length)
          return false;
      if(groupNoAdj(start + 2, nums, target - nums[start]))
          return true;
      return groupNoAdj(start + 1, nums, target);
    }

    public boolean splitOdd10(int[] nums){
        	return sidesAreOdd10(nums, 0, 0, 0);	}
            public boolean sidesAreOdd10(int[] nums, int i, int group1, int group2){
                if(i == nums.length);
                return (group1 % 2 == 1 && group2 % 10 == 0 || group2 % 2 == 1 && group1 % 10 == 0);
                if(sidesAreOdd10(nums, i + 1, group1 + nums[i], group2))
                return true;
                return sidesAreOdd10(nums, i + 1, group1, group2 + nums[i]);
}



public boolean groupSum6(int start, int[] nums, int target) {
    if(start == nums.length){
          if(target == 0)
            return true;
        return false;
       }
       if(nums[start] == 6)
           return groupSum6(start + 1, nums, target - nums[start]);
    if(groupSum6(start + 1, nums, target - nums[start]))
        return true;
    return groupSum6(start + 1, nums, target);
  }
  
  }
}
