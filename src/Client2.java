import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username = ");
        String name = scanner.nextLine();

        Socket socket = new Socket("localhost",8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(name);

        out.close();
        socket.close();

    }
}