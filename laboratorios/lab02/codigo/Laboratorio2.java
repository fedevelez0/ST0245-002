import java.util.Arrays;

public class Laboratorio2
{
    public static void main(String[] args)
    {
        int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        int[][] Arrays = {A,B,C};  
        for (int[] X : Arrays)
        {        
          Laboratory1.mergeSort(X);
          Laboratory1.InsertionSort(X);     
        }
    }


  public static void InsertionSort(int[] A){

         int temp,j;
         for (int i = 0; i < A.length; i++)
         {
           j = i;
           while (j > 0 && A[j-1] > A[j])
             {
                 temp = A[j];
                 A[j] = A[j-1];
                 A[j-1] = temp;
                 j = j-1;
              }           
         }
         System.out.println(Arrays.toString(A));
    
  }

	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

       
	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
        if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}

	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)   
            tmp[k++] = a[left++];

        while(right <= rightEnd) 
            tmp[k++] = a[right++];

       
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];

    }

  
  
}