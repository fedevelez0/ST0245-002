@authors Federico Velez, Rafael Villegas, Jose David Gomez
@author ozelentok
@availability https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Array-3.java
@version 1


public class array03{
    
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        int span;
          int j;
          for(int i = 0; i < nums.length; i++)
          {
              for(j = nums.length - 1; nums[i] != nums[j]; j--);
              span = 1 + j - i;
              if(span > maxSpan)
                  maxSpan = span;
          }
          return maxSpan;
      }

      public boolean canBalance(int[] nums)
{
    int left = 0;
    int right;
    for(int i = 0; i < nums.length - 1; i++)
        left += nums[i];
    right = nums[nums.length-1];
    for(int i = nums.length - 2; i > 0; i--)
    {
        if(left == right)
            return true;
        left -= nums[i];
        right += nums[i];
    }
    return (left == right);
}

public int[] seriesUp(int n) 
{
    int[] arr = new int[n*(n+1)/2];
    int p = 0;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++, p++)
            arr[p] = j;
    }
    return arr;
}



public int countClumps(int[] nums)
{
    int clumps = 0;
    boolean isClump = false;
  for(int i = 0; i < nums.length - 1; i++)
  {
      if(isClump)
      {
          if(nums[i] != nums[i+1])
              isClump = false;
      }
      else if(nums[i] == nums[i+1])
      {
          isClump = true;
          clumps++;
      }
  }
  return clumps;
}

public int[] fix34(int[] nums) 
{
    int j = 1;
    for(int i = 0; i < nums.length - 1; i++)
    {
        if(nums[i] == 3 && nums[i+1] != 4)
        {
            for(; nums[j] != 4; j++);
            nums[j] = nums[i+1];
            nums[i+1] = 4;
        }
    }
    return nums;
}

}

