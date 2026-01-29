package testPractice.Interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		String path = "src/main/resources/WriteFile.txt";

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			writer.write("Senthil kumar");
			writer.newLine();
			writer.write("Automation");
			writer.newLine();
			writer.write("Testing");
			System.out.println("File written scucessfully");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}