package talleres;
public class BinaryTree {

    private Node root;
 
   

   public BinaryTree() {
       this.root = null;
   }

   public BinaryTree(int n) {
       this.root = new Node(n);
   }


   public void insertar(int n) {
       insertarAux(root, n);
   }

   private void insertarAux(Node node, int n) {
       if (node.data == n){
           return;
       }else if (n > node.data) {
           if (node.rigth == null) {
               node.rigth = new Node(n);
           }else {
               insertarAux(root, n);
           }
       }else {
           if (node.left == null) {
               node.left = new Node(n);
           }else {
               insertarAux(root, n);
           }
       }
   }
 

   public boolean buscar(int n) {
       return buscarAux(root, n);
   }
   
   private boolean buscarAux(Node node, int n) {
       if (node.data == n) {
           return true;
       }
       if (node == null) {
           return false;
           
       }
       
       if (n > node.data) {
           return buscarAux(node.left, n);
       }
       return buscarAux(node.rigth, n);
   }


   public void borrar(int n) {
       borrarAux(root, n);
   }
   

    private Node borrarAux(Node node, int n) {
       if (node == null) {
           return null;
       }
       if (node.data == n) {
           if (node.left == null && node.rigth == null) {
               return null;
           }
           if (node.rigth == null) {
               return node.left;
           }
           if (node.left == null) {
               return node.rigth;
           }else {
               node.data = encontrarNodoReemplazo(node.left);
           }
       }
       if (n > node.data) {
           node.rigth = borrarAux(node.rigth, n);
           return node;
       }
       node.left = borrarAux(node.left, n);
       return node;
   }

   private int encontrarNodoReemplazo(Node n) {
       if (n.rigth == null) {
           int res = n.data;
           n = null;
           return res;
       }
       return encontrarNodoReemplazo(n.rigth);
   }
}
