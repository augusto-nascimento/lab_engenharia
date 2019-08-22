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
			System.out.println("Aguardando conexão");
			Socket cli = srv.accept();
			OutputStream out = cli.getOutputStream();
			InputStream in = cli.getInputStream();
			out.write("Olá!!!!".getBytes());
			out.flush();
			int i = 0;
			boolean sair = false;
			while  (!sair) {
				if(in.available() > 0 ) {
					i = in.read();
					System.out.println((char)i);
					if (i == 27) {
						sair = true;
					}					
				}
				if(System.in.available() > 0 ) {
					i = System.in.read();
					out.write(i);
					out.flush();
					System.out.println((char)i);
					if (i == 27) {
						sair = true;
					}					
				}				

			}
			System.out.println("Cliente Desconectado");
			System.out.println("Encerrando Servidor");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
