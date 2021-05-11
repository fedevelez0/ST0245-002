import java.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;

public class DigraphAL extends Digraph {
    private ArrayList<LinkedList<Pair<Integer,Integer>>> nodo;

    public DigraphAL(int size) {
        super(size);
        nodo = new ArrayList<>();
        for(int i = 0 ; i< size; i++){
            nodo.add(new ArrayList<Pair<Integer,Integer>>>());
        }
    }

    public void addArc(int source, int destination, int weight) {
        nodo.get(source).add(new Pair<>(destination,weight));
    }

    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> n = new ArrayList<>();
        nodo.get(vertex).forEach(i->n.add(i.));

        return n;
    }

    public int getWeight(int source, int destination) {
        int resultado = 0;
        for(Pair<Integer,Integer> integerIntegerPair : nodo.get(source)){
            if(integerIntegerPair.getKey()==){
                resultado = integerIntegerPair.getValue();
            }
        }
        return resultado;
    }

}
