package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        Socket clientSocket = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String data = "";
        while (reader.ready() || data.length() == 0){
            data+=(char) reader.read();
        }
        System.out.println(data);
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
        writer.write("HTTP/1.1 200 OK");
        writer.write(String.format("%n%nHello"));
        writer.close();
        reader.close();
        clientSocket.close();
    }
}
