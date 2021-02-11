class Main {
  public static void main(String[] args) {
    System.out.println("hanoi y permutacion");
Main.hanoi(3,"A","B","C");
  }
  public static void hanoi(int n, String A, String B, String C){
    if(n==1){
      System.out.println("de "+A+" a "+ C);
    }else{
      hanoi(n-1,A,C,B);
      hanoi(n-1,A,B,C);
      hanoi(n-1,B,A,C);
    }
  }
  public class Permutacion{
  public static void main(String []arg){
    Permutacion.permutacion("","abc");
  }
  public static void permutacion(String prefix,String str){
    if(str.length() == 0){
       System.out.println(prefix);
    }
  
    for(int i = 0; i<str.length();i++){
      permutacion(prefix+str.charAt(i),str.replace(String.valueOf(str.charAt(i)),""));
    }
}
}
}