import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.NumberFormatException;

public class ExceptionHandling {
    public static void main(String[] args) {
        String s1, s2;
        int a = 0, b = 0, ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\t\tMENU");
            System.out.print("1. Entry\t2. Add\t\t3. Subtract\n4. Multiply\t5. Divide\t6. Exit\n");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            try {
                switch (ch) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        s1 = sc.next();
                        s2 = sc.next();
                        for (int i = 0; i < s1.length(); i++)
                            if (!Character.isDigit(s1.charAt(i)))
                                throw new NumberFormatException();
                        for (int i = 0; i < s2.length(); i++)
                            if (!Character.isDigit(s2.charAt(i)))
                                throw new NumberFormatException();
                        a = Integer.parseInt(s1);
                        b = Integer.parseInt(s2);
                        break;
                    case 2:
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;
                    case 3:
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;
                    case 4:
                        System.out.println(a + " X " + b + " = " + (a * b));
                        break;
                    case 5:
                        if (b == 0)
                            throw new ArithmeticException();

                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Division by zero.\nException: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry.\nException:: " + e);
            }
        } while (ch >= 1 && ch <= 5);
    }
}
