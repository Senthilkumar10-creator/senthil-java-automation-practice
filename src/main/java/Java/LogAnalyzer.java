package Java;

import java.io.*;

public final class LogAnalyzer {

	public static void main(String[] args) {

	/*	Read a large log file and filter out lines containing ERROR messages.
		
		Write those lines to a separate error_logs.txt file. */
		
		String inputFile = "logfile.txt";
		String outputFile = "error_logs.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains("ERROR")) {
					writer.write(line);
					writer.newLine();
				}
			}

			System.out.println("Error lines have been written to " + outputFile);

		} catch (IOException e) {
			System.out.println("An error occured: " + e.getMessage());
		}

	}

}
