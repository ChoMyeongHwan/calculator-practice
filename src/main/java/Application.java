import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        System.out.println("plus = " + calc.plus(num1, num2));
    }
}
