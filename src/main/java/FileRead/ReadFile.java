package FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader("D:\\sample.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;


			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
