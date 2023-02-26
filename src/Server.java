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
            Scanner send = new Scanner(System.in);

            String nameUser = scanner.nextLine();
            System.out.println("Welcome " + nameUser);
            out.flush();

            int i = 0;
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                if (str.equals("bye")) {
                    break;
                }
                if (str.equals("exit") && nameUser.equals("admin")) {
                    socket.getOutputStream().close();
                    socket.getInputStream().close();
                    socket.close();
                }
                i++;
                System.out.println("Сообщение №" + i + "("+ nameUser+") - " + str);
                out.println(i);
                out.flush();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
