public class Taller2 {
	

	public static int gcd(int p, int q){
		
	}



  private static boolean SumaGrupo(int start, int[] nums, int target) {
       if (start == nums.length)
       return target == 0;                       
    
   boolean pongo = SumaGrupo(start+1, nums, target - nums[start]);
   boolean noPongo = SumaGrupo(start+1, nums, target);
   return pongo || noPongo;
    }
	
	public static void combinations(String s) { 
		combinationsAux("", s); 
	}
	
	

	private static void combinationsAux(String prefix, String s) {  
		
	}

}
