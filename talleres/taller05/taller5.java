public class Taller5 {

    public static int[] insertionSort (int[] array){
        int j=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            int j = i;
            int temp = array[j];
            while((j > 0) && (array[j] > temp)){
            array[j] = array[j-1];
            j--;
            }
            array[j] = temp;
        }
        return array;
        }
    
  
    public static int suma (int[]array){
	int sum=0;
	for(int i=0;i< array.length ;i++){
	    sum+=array[i];
	}
        return sum;
    }


   
    public static void mul (int num){
	for(int i=1;i<=10;i++){
	    System.out.println(num+" x "+i+" = "+(i*j));
	}
    }


}

