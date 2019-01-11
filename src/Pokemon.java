import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) throws IOException {
		getPokemon("Grass");
	}
	
	public static void getPokemon(String type) throws IOException{
		try {
			BufferedReader input = null;
			File file = new File("pokemonOutput.csv");
			FileWriter fileWriter = new FileWriter(file);
			
			input = new BufferedReader (new FileReader("Pokemon.csv"));
			String line = input.readLine();
			Scanner s = new Scanner(line).useDelimiter(",");
			
			String[] dataText = new String[13];
			String output = "#,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary\n";
			
			while ((line = input.readLine()) != null) {
				s = new Scanner(line).useDelimiter(",");
				for (int i = 0; i < 13; i++) {
					dataText[i] = s.next();
				}
				if (type.equals(dataText[2]) || type.equals(dataText[3])) {
					for (int i = 0; i < dataText.length; i++) {
						output += dataText[i] +",";
					}
					output += "\n";
					
				}
				
			}
			System.out.print(output);
			fileWriter.write(output);
			fileWriter.flush();
			fileWriter.close();
			input.close();
			
		  } catch (FileNotFoundException ex) {
			System.err.println("The file Pokemon.csv has not been found");
		}
	}

}
