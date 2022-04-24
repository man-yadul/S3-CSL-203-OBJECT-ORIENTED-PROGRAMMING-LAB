import java.util.Scanner;

public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        char c;
        
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to search: ");
        c = sc.next().charAt(0);
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c)
                k++;
        }
        
        System.out.println("The character " + c + " has occured " + k + " times.");
    }
}
