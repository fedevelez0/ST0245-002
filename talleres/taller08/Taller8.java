package Taller__8;
import java.util.stack;

/**
 * La clase Taller8 tiene la intención de
 * enfatizar en el uso de pilas y colas ya 
 * implementadas en java
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html"> Ver más acerca de colas<a/>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html"> Ver más acerca de pilas <a/> 
 * @author Mauricio Toro, Andrés Páez 
 */
public class Taller8 {
 
    /**
    * @param string es una cadena de texto que viene de este modo 3 4 5 * + o de esta manera 2 3 * 5 +
    * todo viene separado por espacios por lo que la funcion split.("") vendría muy bien para separarlos
    * Se intenta hacer el calculo por medio del metodo polaco posfijo
    * @return un entero resultado de la operación
    */
    public static int polaca  (String string){
	    String simbolos="+*/-";
	    prefijo=String.split(" ");
	    Stack<integer> stack=new Stack<>();
	    
	    for(int i=0; i<string.length;i++){
		    if(simbolos.contains(""+string.charAt(i))){
			    int primero=stack.pop();
			    int segundo=stack.pop();
			    char caracter=string.charAt(i);
			    if(caracter="+"){
				    stack.push(segundo+primero);
			    }
			    if(caracter="-"){
				    stack.push(segundo-primero);
			    }
			    if(caracter="*"){
				    stack.push(segundo*primero);
			    }
			    if(caracter="/"){
				    stack.push(segundo/primero);
			    }
		    }else{
			     stack.push(Integer.valueOf(string.charAt(i)));
		    }
	    }
	    return stack.pop;
    }

   /**
     * @param neveras es una estructura de datos para representar el almacen con las neveras
     * @param solicitudes es una estructura de datos para representar las solicitudes
     */
    public static void asignarSolicitudes(Stack<Nevera> neveras, Queue<Solicitud> solicitudes){
        while(solicitudes.peek() != null){
            int cantidad = solicitudes.peek().numero;
            System.out.println(solicitudes.poll().texto()+": ");

            for(int i=0; i<cantidad; i++){
                if(!neveras.isEmpty()){
                    System.out.println("   -> "+ neveras.pop().texto());
                }
            }
        }
    }

    /**
     * @param stack es una pila ya implementada que se crea en el test
     * Este método se encarga de poner la pila stack en orden inverso
     * Nota: recuerde que la funcion pop() no solo expulsa la última 
     * posición de una pila si no que tambien devuelve su valor.
     * @return una pila que haga el inverso de stack
     */
    public static Stack<Integer> inversa (Stack<Integer> stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++) 
            temp.get(stack.pop());
        return temp;
    }

    /**
     * @param queue es una cola ya implementada que se crea en el test
     * Este método se encarga de atender a personas.
     * Nota: Se debe imprimir en consola a quién atiende y sacarlo de la cola
     * existe una función "pull" que hace el trabajo más fácil
     * 
     */
    public static void cola(Queue<String> que){
        while(!que.isEmpty())    
            System.out.println("Atendiendo a " + que.poll());
    }

}
