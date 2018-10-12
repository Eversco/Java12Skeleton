import java.util.Scanner;
public class CatchAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int div = 0;
        try {
            System.out.print("Enter the numerator: ");
            num = scan.nextInt();
            System.out.print("Enter the divisor  : ");
            div = scan.nextInt();
        } catch (ArithmeticException ex) {
            System.out.println("You can't divide " + num + " by " + div);
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
        System.out.println(num + " / " + div + " is " + (num / div) + " rem " + (num % div));
        System.out.println("Good-by");
    }
}