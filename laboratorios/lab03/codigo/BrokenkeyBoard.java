  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class BrokenKeyBoard {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ((s=br.readLine())!=null) {
			LinkedList<Character> value=new LinkedList<>();
			int pointerLocation=0;
			for (char c : s.toCharArray()) {
				if (c=='[') pointerLocation=0;
				else if (c==']') pointerLocation=value.size();
				else value.add(pointerLocation++,c);
			}
			
			StringBuilder sb=new StringBuilder();
			for (char c : value) sb.append(c);
			System.out.println(sb.toString());
		}
	}
}