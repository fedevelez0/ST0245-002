package Taller__8;
import java.util.*;

public class Taller8 {

    public static int polaca  (String string){
	    String simbolos="+*/-";
	    prefijo=String.split(" ");
	    Stack<integer> stack=new Stack<>();
	    
	    for(int i=0; i<string.length;i++){
		    if(simbolos.contains(""+string.charAt(i))){
			    int a=stack.pop();
			    int b=stack.pop();
			    char caracter=string.charAt(i);
			    if(caracter="+"){
				    stack.push(b+a);
			    }
			    if(caracter="-"){
				    stack.push(b-a);
			    }
			    if(caracter="*"){
				    stack.push(b*a);
			    }
			    if(caracter="/"){
				    stack.push(b/a);
			    }
		    }else{
			     stack.push(Integer.valueOf(string.charAt(i)));
		    }
	    }
	    return stack.pop;
    }


    public static Stack<Integer> inversa (Stack<Integer> stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++) 
            temp.get(stack.pop());
        return temp;
    }


    public static void cola(Queue<String> queue){
        while(!queue.isEmpty())    
            System.out.println("Atendiendo a " + queue.poll());
    }

}
