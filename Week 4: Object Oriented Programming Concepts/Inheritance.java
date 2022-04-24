import java.util.Scanner;

class Employee {
    String name, address;
    int age, phno;
    float salary;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter phone number: ");
        phno = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
    }

    void Print() {
        System.out.println("\n\tEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phno);
        PrintSalary();
    }

    void PrintSalary() {
        System.out.print("Salary of the employee: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Enter specialization: ");
        specialization = sc.nextLine();
    }

    void Print() {
        super.Print();
        System.out.println("\nSpecialization: " + specialization);
    }
}

class Manager extends Employee {

    String department;

    void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    void Print() {
        super.Print();
        System.out.println("\nDepartment: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Officer officer = new Officer();
        Manager manager = new Manager();
        System.out.println("\tEnter details of Officer\n");
        officer.Input();
        System.out.println("\n\tEnter details of Manager\n");

        manager.Input();
        officer.Print();
        manager.Print();
    }
}
