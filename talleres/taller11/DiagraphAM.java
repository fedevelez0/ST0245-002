import java.util.ArrayList;

public class DigraphAM extends Digraph {

    int[][] mat;
    public DiagraphAM(int size) {
        super(size);
        mat = new int[size][size];
        for(int i = 0; i<size; i++){
            mat[i][0]=i;
            mat[0][i]=i;

        }
    }

    public void addArc(int source, int destination, int weight) {
        mat[source][destination] = weight;

    }

    public ArrayList<Integer> getSuccessors(int vertex) {
            ArrayList<Integer> np = new ArrayList<>();
            for(int i =1 ; i <size; i++){
                if(mat[vertex][i]!=0){
                    np.add(mat[0][i]);
                }
            }
            return np;
    }

    public int getWeight(int source, int destination) {
        return mat[source][destination];
    }

}
