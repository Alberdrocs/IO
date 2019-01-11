import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCSVVersionCerda {

	public static void main(String[] args) throws IOException {
		
		if (args.length != 1) {
			System.out.println("Usage: ReadCSV <filename>");
		}
		
		BufferedReader input = null;
		
		int numOfLines = 0;
    	
   	 BufferedReader inputStream = null;
   	 try {
	    	inputStream = new BufferedReader(new FileReader(args[0]));
	    	String line;

	    	while ((line = inputStream.readLine()) != null) {
	    		numOfLines++;
	    	}
	    	
   	 } catch (FileNotFoundException ex) {
   		 System.out.println("File " + args[0] + " not found");
   	 } catch (IOException e) {
			System.out.println("Error reading file " + args[0]);
		 }
   	 
   	 finally {
	    	 if (inputStream != null) {
	    		 inputStream.close();
	    	 }
   	}
   	 
   	 
		
		
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
			
			String numbers = input.readLine();
			Scanner a = new Scanner(numbers).useDelimiter(",");
			
			for (int i = 0; i < numOfLines-1; i++) {
				a = new Scanner(numbers).useDelimiter(",");
				for (int j = 0; j < c; j++) {
					int x = a.nextInt();
					accumulators[j] += x;
				}
				numbers = input.readLine();
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
