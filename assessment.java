1.username and password

public class assessment1 {
    public static void main(String[] args) {

        String username = "admin";
        String password = "142817";

        if (username!=("admin") && password!=("142817")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}


2.sum of digits

class assessment2 {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}


3.

import java.util.Scanner;

class assessment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}



4.



class assessment4 {
    public static void main(String[] args) {

        String name = "admin";
        int roll = 163;
        int age = 20;
        String dept = "ECE";
        String email = "admin123@gmail.com";

        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("Email: " + email);
    }
}



5.



class assessment5 {
    public static void main(String[] args) {

        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
