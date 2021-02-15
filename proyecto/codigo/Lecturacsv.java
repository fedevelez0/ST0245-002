import java.io.*;
public class ReadCSV{
      try{
       BufferedReader reader = new BufferedReader(new FileReader("movies.csv"));
        String line = null;
        while(((line = reader.readline()) != null){
            String [] parts = line.split(",");
            int totalParts = parts.length;
            for(int i = 0; i < totalParts; i++){
                System.out.print(parts[i] + " ");
            }
            System.out.println("\n");
        }
      }catch (IOExeption e){
       e.printStacTrace();
      }
}