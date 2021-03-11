package taller7;
import java.lang.IndexOutOfBoundsException; 
import taller7.Node;

public class LinkedListLuisa {

    Node first;
    private int size;
    
    public LinkedListLuisa() {
        size = 0;
        first = null;
    }

    
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

   
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return temp.data;
    }


    public int size() {
        return size;
    }

    public void insert(int data, int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            Node nuevo = new Node(data);
            nuevo.next = temp.next;
            first = temp.next;
            size++;
        } else if(index != 0){
            Node temp = getNode(index - 1);
            Node nuevo = new Node(data);
            nuevo.next= temp.next;
            temp.next = nuevo;
            index++;
        }else 
        {
            throw new IndexOutOfBoundsException();
        }
    }


    public void remove(int index) {
        try {
            if (index == 0) {
                Node temp = first;
                first = temp.next;
                index --;
            } else if (index == size - 1) {
                Node temp = getNode(size - 2);
                temp.next = null;
                index--;
            } else {
                Node temp = getNode(index - 1);
                temp.next= temp.next.next;
                index --;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }

    }


    public boolean contains(int data) {
        try {
            for (int i = 0; i < size; i++) {
                if (get(i) == data) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }
        return false;
    }
}
