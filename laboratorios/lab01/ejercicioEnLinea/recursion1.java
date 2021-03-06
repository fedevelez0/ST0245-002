@authors Federico Velez, Rafael Villegas, Jose David Gomez
@author ozelentok
@availability https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Recursion-1.java
@version 1

public class recursion1{
  public int sumDigits(int n){
    if(n < 10)
      return n;
    return sumDigits(n/10) + n%10;
  }

  public int bunnyEars(int bunnies) {
      if(bunnies == 0)
      return 0;
      return 2+bunnyEars(bunnies-1);
  
  }


  public int bunnyEars2(int bunnies) {

    if (bunnies == 0) return 0;
  
    if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
  
    else return 2 + bunnyEars2(bunnies-1);
  
  }


  public int fibonacci(int n) {
      if (n<2)
      return n;
      return fibonacci(n-2)+fibonacci(n-1);
  }

  public int count7(int n)
  {
      if(n == 0)
          return 0;
      if(n % 10 == 7)
          return 1+count7(n/10);
      return count7(n/10);
  }
}