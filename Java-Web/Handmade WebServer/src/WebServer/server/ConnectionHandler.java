package WebServer.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionHandler implements Runnable {
    private final Socket socket;
    private final BufferedReader buffedReader;
    private final PrintWriter writer;

    public ConnectionHandler(Socket clientSocket) throws IOException {
        this.socket = clientSocket;
        this.buffedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.writer = new PrintWriter(socket.getOutputStream());
    }

    @Override
    public void run() {

    }
}
