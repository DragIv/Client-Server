import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello " + args[2]);

        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        System.out.println(3*Math.pow(Math.cos(x - (Math.PI/6)),2)/ 0.5 +Math.sin(y*y));
    }
}