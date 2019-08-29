package myfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.util.Scanner;

public class GravarNomes {

	public static void main(String[] args) {
		try {
			String path = "C:/nome.txt"; 
			File f = new File(path);
			FileWriter fw = new FileWriter(f);
			gravar(fw);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Concluido");
		}
	}
	
	public static void gravar(FileWriter fw) {
		String nome;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Para sair do programa digite `sair`, ou ");
		System.out.println("Entre com o nome: ");
    	
		while (!(nome = input.next()).equals("sair")) {
			try {				
				fw.write(nome + "\n");
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Entre com o nome: ");
		}
	}

}
