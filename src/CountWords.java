import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		if(args.length != 1) {
    		System.out.println("Usage: CountLines <filename>");
    		System.exit(1);
    	}
    	
    	int numOfWords = 0;
    	
    	 Scanner s = null;
    	 
    	 try {
	    	s = new Scanner(new FileReader(args[0]));
	    	while (s.hasNext()) {
				numOfWords++;
				s.next();
			 }
	    	System.out.println(numOfWords);
		 } finally {
			 if (s != null) {
				 s.close();
			 }
		 }
	 }
}