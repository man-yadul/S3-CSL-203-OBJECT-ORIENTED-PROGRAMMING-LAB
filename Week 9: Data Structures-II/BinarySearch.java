import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        int item, mid, beg, end, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of integers: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("Enter the integers (in ascending order): ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter the element to search: ");
        item = sc.nextInt();

        beg = 0;
        end = n - 1;
        mid = (beg + end) / 2;

        while (beg <= end) {
            if (a[mid] < item)
                beg = mid + 1;
            else if (a[mid] == item) {
                System.out.println(item + " is found at position " + (mid + 1) + ".");
                break;
            } else
                end = mid - 1;
            mid = (beg + end) / 2;
        }
        if (beg > end)
            System.out.println("Element not found.");
    }
}
