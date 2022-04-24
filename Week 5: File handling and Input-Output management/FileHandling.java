import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String text;
        String directory = System.getProperty("user.home");
        String filename = "file.txt";
        String filepath = directory + File.separator + filename;
        Scanner sc = new Scanner(System.in);

        // Writing and reading using FileInputStream & FileOutputStream (byte stream)
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filepath);
            System.out.println("FileInputStream & FileOutputStream:");
            System.out.println("Enter data to write: (Type q to exit)");
            do {
                text = sc.nextLine();
                if (!(text.equals("q")))
                    fout.write(text.getBytes());
            } while (!(text.equals("q")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fout != null)
                    fout.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        try {
            fin = new FileInputStream(filepath);
            int ch = fin.read();
            System.out.print("Entered text: ");
            do {
                System.out.print((char) ch);
                ch = fin.read();
            } while (ch != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }

        // Writing and reading using BufferedInputStream & BufferedOutputStream (byte
        // stream)
        BufferedInputStream fin1 = null;
        BufferedOutputStream fout1 = null;
        try {
            fout1 = new BufferedOutputStream(new FileOutputStream(filepath));
            System.out.println("\n\nBufferedInputStream & BufferedOutputStream:");
            System.out.println("Enter data to write: (Type q to exit)");
            do {
                text = sc.nextLine();
                if (!(text.equals("q")))
                    fout1.write(text.getBytes());
            } while (!(text.equals("q")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fout1 != null)
                    fout1.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        try {
            fin1 = new BufferedInputStream(new FileInputStream(filepath));
            int ch = fin1.read();
            System.out.print("Entered text: ");
            do {
                System.out.print((char) ch);
                ch = fin1.read();
            } while (ch != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fin1 != null)
                    fin1.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }

        // Writing and reading using FileReader & FileWriter (character stream)
        FileReader fin2 = null;
        FileWriter fout2 = null;
        try {
            fout2 = new FileWriter(filepath);
            System.out.println("\n\nFileReader & FileWriter:");
            System.out.println("Enter data to write: (Type q to exit)");
            do {
                text = sc.nextLine();
                if (!(text.equals("q")))
                    fout2.write(text);
            } while (!(text.equals("q")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fout2 != null)
                    fout2.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        try {
            fin2 = new FileReader(filepath);
            int ch = fin2.read();
            System.out.print("Entered text: ");
            do {
                System.out.print((char) ch);
                ch = fin2.read();
            } while (ch != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fin2 != null)
                    fin2.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }

        // Writing and reading with BufferedWriter & BufferedReader (character stream)
        BufferedReader fin3 = null;
        BufferedWriter fout3 = null;
        try {
            fout3 = new BufferedWriter(new FileWriter(filepath));
            System.out.println("\n\nBufferedReader & BufferedWriter:");
            System.out.println("Enter data to write: (Type q to exit)");
            do {
                text = sc.nextLine();
                if (!(text.equals("q")))
                    fout3.write(text);
            } while (!(text.equals("q")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fout3 != null)
                    fout3.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        try {
            fin3 = new BufferedReader(new FileReader(filepath));
            String line = fin3.readLine();
            System.out.print("Entered text: ");
            while (line != null) {
                System.out.println(line);
                line = fin3.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O exception has occured.");
        } finally {
            try {
                if (fin3 != null)
                    fin3.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
        sc.close();
    }
}
