import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class lectorCSV{
    public static void main(String[] args){
        //leer el archivo csv seperado por comas//
        Arraylist<int[]> imagen = new Arraylist<int[]>();
        String linea=" ";
        String archivoCSV ="C:\Users\fedevelez\OneDrive - Universidad EAFIT\Documentos\datos y algoritmos\ST0245-002\proyecto\codigo\archivosCSV";
        try{
            BufferedReader br= new BufferedReader(new FileReader("archivoCSV"));
            while((linea=br.readLine())!=null){
                String[] valores = linea.split(",");
                int[] elements = new int [valores.lenght];
                for (int i = 0; i < valores.lenght; i++){
                    int valor  = Integer.parseInt(valores[i]);
                    elements[i] = valor;
                }
                foto.add(elements);
            }
            //lanzar excepcion//
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}