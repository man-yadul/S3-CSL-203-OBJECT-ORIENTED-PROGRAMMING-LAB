import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {

        int num, reversed = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
