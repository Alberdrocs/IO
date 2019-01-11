import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) throws IOException {
    	
    	if(args.length != 1) {
    		System.out.println("Usage: CountLines <filename>");
    		System.exit(1);
    	}
    	
    	int numOfLines = 0;
    	
    	 BufferedReader inputStream = null;
    	 try {
	    	inputStream = new BufferedReader(new FileReader(args[0]));
	    	String line;

	    	while ((line = inputStream.readLine()) != null) {
	    		numOfLines++;
	    	}
	    	 System.out.println(numOfLines);
	    	
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
	}
}