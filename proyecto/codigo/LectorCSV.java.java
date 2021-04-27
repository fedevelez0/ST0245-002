import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class leerCSV{
    public static void main(String[] args){
        //leer el archivo csv seperado por comas//
        String path="C:\Users\fedevelez\OneDrive - Universidad EAFIT\Documentos\datos y algoritmos\ST0245-002\proyecto\codigo\ganado.csv";
        String linea=" ";
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            ArrayList<Integer> datos=new ArrayList<Integer>();
            while((linea=br.readLine())!=null){
                String[] valores=linea.split(",");
                List<String> list=Arrays.asList(valores);
                System.out.println(list);
            }
            //lanzar excepcion//
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
