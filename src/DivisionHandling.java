import java.util.Scanner;

public class DivisionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Reading two integers a and b
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Attempting the division
            int result = a / b;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            // This block executes only if b is 0
            System.out.println("Divide by zero error");
        } finally {
            sc.close();
        }
    }
}
