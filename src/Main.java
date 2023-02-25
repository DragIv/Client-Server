import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello " + args[0]);

        System.out.print("Номер варианта = ");
        int V = scanner.nextInt();
        double a;
        double a1;
        double a2;
        double x;
        double b;
        double c;
        double d;
        double y;
        double w;
        double n;




        try{


            switch (V) {
                case (1) -> {
                    System.out.print("a = ");
                    a = scanner.nextDouble();
                    System.out.print("n = ");
                    n = scanner.nextDouble();
                    System.out.print("b = ");
                    b = scanner.nextDouble();
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    System.out.print("c = ");
                    c = scanner.nextDouble();
                    if(b+c == 0) throw new ArithmeticException("Деление на 0  b+c = 0");


                    System.out.println("Hello " + args[0] + ", option: " + V + ", a = " + a + ", n = " + n + ", x = " + x + ", b = " + b + ", c = " + c + ", result = " + (((5 * Math.pow(a, n * x)) / (b + c)) - (Math.sqrt(Math.abs(Math.cos(Math.pow(x, 3)))))));
                }
                case (2) -> {
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    System.out.print("y = ");
                    y = scanner.nextDouble();
                    System.out.print("w = ");
                    w = scanner.nextDouble();
                    System.out.print("a = ");
                    a = scanner.nextDouble();
                    if(w <= -1) throw new ArithmeticException("Подкоренное выражение < 1");
                    System.out.println("Hello " + args[0] + ", option: " + V + ", x = " + x + ", y = " + y + ", w = " + w + ", result = " + ((Math.abs(x - y) / Math.pow((1 + 2 * x), a)) - Math.exp(Math.sqrt(1 + w))));
                }
                case (3) -> {
                    System.out.print("a = ");
                    a = scanner.nextDouble();
                    System.out.print("a1 = ");
                    a1 = scanner.nextDouble();
                    System.out.print("a2 = ");
                    a2 = scanner.nextDouble();
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    if((Math.sqrt(a + a1 * x + a2 * Math.pow(Math.sqrt(Math.abs(Math.sin(x))), 1.0 / 3.0))) <= -1) throw new ArithmeticException("Подкоренное выражение < 1");
                    System.out.println("Hello " + args[0] + ", option: " + V + ", a = " + a + ", a1 = " + a1 + ", a2 = " + a2 + ", x = " + x + ", result = " + Math.sqrt(a + a1 * x + a2 * Math.pow(Math.sqrt(Math.abs(Math.sin(x))), 1.0 / 3.0)));
                }
                case (4) -> {
                    System.out.print("a = ");
                    a = scanner.nextDouble();
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    System.out.println("Hello " + args[0] + ", option: " + V + ", a = " + a + ", x = " + x + ", result = " + Math.log(Math.abs(Math.pow(a, 7))) + Math.atan(x * x) + (Math.PI / (Math.sqrt(Math.abs(a + x)))));
                }
                case (5) -> {
                    System.out.print("a = ");
                    a = scanner.nextDouble();
                    System.out.print("b = ");
                    b = scanner.nextDouble();
                    System.out.print("c = ");
                    c = scanner.nextDouble();
                    System.out.print("d = ");
                    d = scanner.nextDouble();
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    if(d+c == 0) throw new ArithmeticException("Деление на 0  c+d = 0");
                    if(x <= -1) throw new ArithmeticException("Подкоренное выражение < 1");
                    System.out.println("Hello " + args[0] + ", option: " + V + ", a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", x = " + x + ", result = " + (Math.pow(Math.sqrt(Math.pow(a + b, 2) / c + d) + Math.exp(Math.sqrt(x + 1)), 1.0 / 5.0)));
                }
                case (6) -> {
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    System.out.println("Hello " + args[0] + ", option: " + V + ", x = " + x + ", result = " + (Math.exp((2.0 * Math.sin(4.0 * x) + Math.pow(Math.cos(Math.pow(x, 2.0)), 2.0))) / (3.0 * x)));
                }
                case (7) -> {
                    System.out.print("x = ");
                    x = scanner.nextDouble();
                    if(x == 1) throw new ArithmeticException("Деление на 0");
                    System.out.println("Hello " + args[0] + ", option: " + V + ", x = " + x + ", result = " + (0.25 * (((1.0 + Math.pow(x, 2.0)) / (1.0 - x)) + 0.5 * Math.tan(x))));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
