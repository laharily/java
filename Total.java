import java.io.File;
import java.io.*;
import java.util.Scanner;

/** This program reads a file with numbers, and writes the numbers to another file, lined up in a column and followed by their total. 
*/  
public class Total {  
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		System.out.print("Output file: ");
		String outputFileName = console.next();
		// Construct the Scanner and PrintWriter objects for reading and writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		in.useDelimiter(" N/A");
		PrintWriter out = new PrintWriter(outputFileName);
		// Read the input and write the output
		int total = 0;
		while (in.hasNextInt()) {
			total += Integer.parseInt(in.next());
			out.println("total: " + total);
		}
		out.println(total);
		in.close();
		out.close();
	}
}