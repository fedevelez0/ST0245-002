import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;


public class taller06 {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
  
    public MiArrayList() {
        size = 0;
        elements = new elements[DEFAULT_CAPACITY];
    }    

    int size() {
        return size;
    }

    public void add(int e) {
        
        if (size == elements.length){
            int j= (int) (Math.ceil (elements.length * 1.5));
            int[] nuevo = new int[j];
            for (int i = 0; i < elements.length; i++)
                nuevo[i] = elements[i]; 
            elements = nuevo;
        }
        elements[size] = e;
        size = size + 1;
    }   
    public int get(int i) {
        return elements[i];
    }

    public void add(int index, int e) {
        for (int i = elements.length; i >= index; i--){
            elements[i+1] = elements[i];
            elements[index] = e;
        }
    }


    public void del(int index){
        for (int i = index; i < elements.length-1; i++){
            elements[i] = elements[i+1];
            
        }
    }
}
