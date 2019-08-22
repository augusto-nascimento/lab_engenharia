package mysocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStream;

public class Server {
	public static void main(String[] args) {
		try (ServerSocket srv = new ServerSocket(9000)){
			System.out.println("Iniciando Servidor");
			System.out.println("Aguardando conex�o");
			Socket cli = srv.accept();
			OutputStream out = cli.getOutputStream();
			InputStream in = cli.getInputStream();
			out.write("Ol�!!!!".getBytes());
			out.flush();
			int i = 0;
			while  ((i = in.read()) != 27) {
				System.out.println((char)i);
			}
			System.out.println("Cliente Desconectado");
			System.out.println("Encerrando Servidor");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
