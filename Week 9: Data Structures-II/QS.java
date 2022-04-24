import java.util.Scanner;

class QuickSort {
    static int partition(String str[], int beg, int end) {
        String pivot = str[beg], temp;
        int i = beg, j = end;
        do {
            while (str[i].compareToIgnoreCase(pivot) <= 0)
                i++;
            while (str[j].compareToIgnoreCase(pivot) > 0)
                j--;
            if (i < j) {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        } while (i < j);
        temp = str[beg];
        str[beg] = str[j];
        str[j] = temp;
        return j;
    }

    static void quicksort(String str[], int beg, int end) {
        int index;
        if (beg < end) {
            index = partition(str, beg, end);
            quicksort(str, beg, index - 1);
            quicksort(str, index + 1, end);
        }
    }
}

public class QS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no. of names: ");
        n = sc.nextInt();
        sc.nextLine();

        String str[] = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++)
            str[i] = sc.nextLine();
        QuickSort.quicksort(str, 0, n - 1);
        System.out.println("Sorted names: ");
        for (int i = 0; i < n; i++)
            System.out.println(str[i]);
    }
}
