package myfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public static void main(String[] args) {
		try {
			String path = "C:\\Windows\\Panther\\setupact.log"; 
			File f = new File(path);
			if (f.exists() && f.canRead()) {
				FileReader fr = new FileReader(f);
				int i = 0;
				while ((i = fr.read()) != -1) {
					System.out.print((char)i);
				}
				fr.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Concluido");
		}

	}

}