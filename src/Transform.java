import java.io.*;

public class Transform {

	public static void main(String[] args) throws IOException {
		if (args.length<2) {
			System.out.println("Error. We need 2 files");
			return;
		}
		BufferedReader in = null;
		PrintWriter out = null;
		try { 
			in = new BufferedReader(new FileReader(args[0]));
			out = new PrintWriter(new FileWriter(args[1]));
			String line;
			while ((line = in.readLine()) != null) {
				out.println(line.toUpperCase()); 
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			} 
		} 
		

	}

}
