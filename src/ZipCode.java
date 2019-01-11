import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ZipCode {

	public static void main(String[] args) throws IOException {
		
		System.out.println(getText(12001));
		System.out.println();
		System.out.println(getText(12580));
		
	}
	
	public static String getText(int zipCode) throws IOException {
		
		
		try {
			
			BufferedReader input = null;	
			
			input = new BufferedReader (new FileReader("zipcodes.csv"));
			String line = input.readLine();

			
			String[] fieldText = new String[4];
			
			while ((line = input.readLine()) != null) {
				Scanner s = new Scanner(line).useDelimiter(";");
				for (int i = 0; i < 3; i++) {
					fieldText[i] = s.next();
				}
				int zipCode1 = Integer.parseInt(s.next());
					if (zipCode1 == zipCode) {
						fieldText[3] = s.next();
						if (fieldText[2].equals("true")) {
							String output = "codProvince: " + fieldText[0]
									+ "\nCity: " + fieldText[1] 
									+ "\nFirstStreet: " + fieldText[3]
									+ "\nzip Code: " + zipCode1;
							return output;
						} else {
							String output =  "codProvince: " + fieldText[0]
									+ "\nProvince: " + fieldText[1]
									+ "\nCity: " + fieldText[3]
									+ "\nzip Code: " + zipCode1;
							return output;
						}
					}
				fieldText[3] = s.next();
			}
			
			
		} catch (FileNotFoundException ex) {
			System.err.println("The file zipcodes.csv has not been found");
		}
		 
		finally {
			// TODO: handle finally clause
		}
		
		
		
		return null;
	}

}
