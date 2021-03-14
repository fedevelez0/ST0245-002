@authors Federico Velez, Rafael Villegas, Jose David Gomez
@author ozelentok
@availability https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Array-2.java
@version 1

public class Array02 {


    public boolean has22(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 2)
                return true;
        }
        return false;
      }
      

    public boolean has77(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 7){
                  if(nums[i+1] == 7)
                      return true;
                      else if(i < nums.length - 2 && nums[i+2] == 7)
                      return true;
              }
          }
          return false;
      }

    public boolean sum28(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2)
                sum += 2;
            }
            return (sum == 8);
        }
       
    public int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
		if(nums[i] == 13)
        i++;
        else
        sum += nums[i];
     }
     return sum;
    }
    
    
    
    public int countEvens(int[] nums){
	int count = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] % 2 == 0)
			count++;
	}
	return count;
}

}


