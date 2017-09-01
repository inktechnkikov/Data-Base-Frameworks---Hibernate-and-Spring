package WebServer.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.FutureTask;

public class ServerImpl implements Server {
    private boolean isRuning;
    private final ServerSocket serverSocket;

    public ServerImpl(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        this.isRuning = true;
    }

    @Override
    public void RunServer() throws SocketException {
        System.out.println("Server started..");
        this.serverSocket.setSoTimeout(10000);
    }
    private void acceptRequst(){
        while (isRuning){
            try(Socket clientSocket = serverSocket.accept()){
                clientSocket.setSoTimeout(10000);
                ConnectionHandler connectionHandler = new ConnectionHandler(clientSocket);
                FutureTask<?> futureTask = new FutureTask<>(connectionHandler,null);
                futureTask.run();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
