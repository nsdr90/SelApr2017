package FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("G:\\Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
	}

}
