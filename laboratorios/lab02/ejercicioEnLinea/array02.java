@authors Federico Velez, Rafael Villegas, Jose David Gomez
@author ozelentok
@availability https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Array-2.java
@version 1

public class Array02 {


        public int[] zeroFront(int[] nums){
            int zeroIndex = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    nums[i] = nums[zeroIndex];
                    nums[zeroIndex] = 0;
                    zeroIndex++;
                }
            }
            return nums;
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
    
    public boolean more14(int[] nums){
    int balance = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 1)
            balance++;
        else if(nums[i] == 4)
            balance--;
    }
    return (balance > 0);
}
    
    public int countEvens(int[] nums){
	int count = 0;
	for(int i = 0; i < nums.length; i++){
		if(nums[i] % 2 == 0)
			count++;
	}
	return count;
}
public int[] evenOdd(int[] nums){
    int temp;
  int evenIndex = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] % 2 == 0){
            temp = nums[i];
            nums[i] = nums[evenIndex];
            nums[evenIndex] = temp;
            evenIndex++;
        }
    }
    return nums;
}

}


