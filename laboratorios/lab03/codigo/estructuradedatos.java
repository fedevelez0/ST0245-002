import java.util.*;
public class EstructuraDeDatos{

    public int size;
    public ArrayList<Triplet<Node, Node, Double>> adjGraph = new ArrayList<>();

    public DataStructure(HashMap<Long, Node> nodes, ArrayList<Triplet<Long, Long, Double>> edges){
        this.size = size();
        for(Triplet<Long, Long, Double> t : edges) {
            Triplet<Node, Node, Double> tr = new Triplet(nodes.get(t.x), nodes.get(t.y), nodes.get(t.z));
            adjGraph.add(tr);
        }
    }
public  ArrayList<Long> getSuccessors(Long vertexID){
        ArrayList<Long> sucesores = new ArrayList<>();
        for(int i=0; i<adjGraph.size(); i++){
            Triplet<Node, Node, Double> n = adjGraph.get(i);
            if(vertexID == adjGraph.get(i).x.id){
                sucesores.add(n.x.id);
            }
        }
        return sucesores;
    }
public Double getWeight(Long sourceID, Long destinationID){
        for(int i=0; i < adjGraph.size(); i++){
            if((sourceID == adjGraph.get(i).x.id) && (destinationID == adjGraph.get(i).y.id)){
                return adjGraph.get(i).z;
            }
        }
        return -1.0;
    }
public int size() {
        return this.size;
    }
}