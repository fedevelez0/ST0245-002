public class Laboratorio1{

/**
 * 1.1
 */
public static int LCS(String str1, String str2){

  if(str1.length() == 0 || str2.length() == 0)
    return 0;
  

  else if (str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1))
    return LCS(str1.substring(0,str1.length()-1), str2.substring(0,str2.length()-1)) + 1;
  
 
  else
    return Math.max(LCS(str1.substring(0,str1.length()-1), str2), LCS(str1, str2.substring(0,str2.length()-1)));
  
}

/**
 * 1.2
 */
public static int ways(int n) {
    if (n <= 1)
      return n;
    return ways(n - 1) + ways(n - 2);
  }
}
}