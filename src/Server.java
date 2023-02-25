import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("Сервер запущен");

        while (true){
            Socket sock = serverSocket.accept();
            Thread t = new Thread(new ClientHandler(sock));
            t.start();
        }
    }
}

class ClientHandler implements Runnable{
    Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            while (scanner.hasNext()){
                System.out.println("Welcome " + scanner.nextLine());
            }
            scanner.close();
            socket.close();
        } catch (Exception e) {}
    }
}
