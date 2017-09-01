package WebServer;

import WebServer.server.Server;
import WebServer.server.ServerImpl;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8080);
            Server server = new ServerImpl(socket);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
