import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        int i, sum = 0;
        String line;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter line of integers:");
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            System.out.print("Entered integers: ");
            while (st.hasMoreTokens()) {
                i = Integer.parseInt(st.nextToken());
                System.out.print(i + "\t");
                sum += i;
            }
            System.out.println("\nSum: " + sum);
        } catch (IOException e) {
            System.out.println("I/O Exception occured.");
        }
    }
}
