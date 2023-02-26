import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner send = new Scanner(System.in);
        Scanner scanner = new Scanner(socket.getInputStream());

        System.out.print("Username = ");
        String name = send.nextLine();
        out.println(name);

        while (true){
            System.out.print("Enter your message: ");
            String words = send.nextLine();
            out.println(words);
            out.flush();
            String s = scanner.nextLine();
            System.out.println("Ответ сервера: " + s + " - " + words);
        }
    }
}