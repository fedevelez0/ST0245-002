public class Taller5 {
    
    
    
    public static int arrayMax(int[] array, int n) {
	int i, max, temp;
	max = array[ ____ ];
	if(n ____ 0){
	    temp = arrayMax(array, _____ );
	    if(temp ____ max)
		max = temp;
	}
	return max;
    }
    
   
    public static boolean groupSum(int start, int[] nums, int target)
    {
      if(target == 0)
          return true;
      if(start == nums.length)
          return false;
      if(groupSum(start + 1, nums, target - nums[start]))
          return true;
      return groupSum(start + 1, nums, target);
    }
	
    
    public static long fibonacci(int n) { 
	if (n <= 1) 
	    return _____ ;  
	else 
	    return __________ + fibonacci(n-2);
    }
}