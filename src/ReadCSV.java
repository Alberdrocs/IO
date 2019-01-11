import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCSV {

	public static void main(String[] args) throws IOException {
		
		if (args.length != 1) {
			System.out.println("Usage: ReadCSV <filename>");
		}
		
		BufferedReader input = null;	
		
		try {
			input = new BufferedReader (new FileReader(args[0]));
			String line = input.readLine();
			Scanner s = new Scanner(line);
			
			s.useDelimiter(",");
			int c = 0;
			while(s.hasNext()) {
				c++;
				s.next();
			}
			s.close();
			String[] fieldNames = new String[c];
			int[] accumulators = new int[c];
			for (int i = 0; i < accumulators.length; i++) {
				accumulators[i] = 0;
			}
			
			Scanner s1 = new Scanner(line).useDelimiter(",");
			
			for (int i = 0; i < c; i++) {
				fieldNames[i] = s1.next();
			}
	
			while ((line = input.readLine()) != null) {
				line = line.replaceAll(" ", "");
				Scanner a = new Scanner(line).useDelimiter(",");
				for (int i = 0; i < accumulators.length; i++) {
					accumulators[i] += a.nextInt();
				}
			}
			
			for (int i = 0; i < c; i++) {
				System.out.println(fieldNames[i] + ": " + accumulators[i]);
			}
			
		}
		finally {
			if (input != null) {
				input.close();
   	 }	
		}

	}

}
