import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
}

class DoublyLinkedList {
    Node start, end = null;

    void insert() {
        Node newnode = new Node();
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.print("Enter data to insert: ");
        data = sc.nextInt();
        newnode.data = data;
        if (start == null) {
            start = end = newnode;
            start.prev = null;
            end.next = null;
        } else {
            end.next = newnode;
            newnode.prev = end;
            end = newnode;
            end.next = null;
        }
    }

    void display() {
        Node i = start;
        if (start == null) {
            System.out.println("List is empty.");
            return;
        } else {
            System.out.print("List: ");
            while (i != null) {
                System.out.print(i.data + "\t");
                i = i.next;
            }
        }

    }

    void delete() {
        Scanner sc = new Scanner(System.in);
        int item;
        System.out.print("Enter data to delete: ");
        item = sc.nextInt();
        Node i = start;
        while (i != null) {
            if (i.data == item)
                break;
            i = i.next;
        }
        if (i == null) {
            System.out.println("Node not found.");
            return;
        }
        if (start == end) {
            System.out.println("Deleted data: " + start.data);
        } else {
            if (i.prev == null) {
                System.out.println("Deleted data: " + i.data);
                start = start.next;
                start.prev = null;
            } else if (i.next == null) {
                System.out.println("Deleted data: " + i.data);
                end = end.prev;
                end.next = null;
            } else {
                System.out.println("Deleted data: " + i.data);
                i.next.prev = i.prev;
                i.prev.next = i.next;
            }
        }
    }
}

public class DLL {
    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();

        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n\t\tMENU");
            System.out.println("1. Insert\t\t2. Display\n3. Delete a node\t4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.insert();
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.delete();
                    break;
            }
        } while (ch >= 1 && ch <= 3);
    }
}
