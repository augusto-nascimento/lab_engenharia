package myfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {
	public static void main(String[] args) {
		try {
			String path = "C:/Users/Laboratorio 201/Documents/teste.txt"; 
			File f = new File(path);
			FileWriter fw = new FileWriter(f);
			fw.write("Hello Word");
//			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Concluido");
		}
	}
}
