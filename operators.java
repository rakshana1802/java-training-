public class arithmetic {
    public static void main(String[]args){
        int a=10;
        int b=5;
        System.out.println("addition="+(a+b));
        System.out.println("subtraction="+(a-b));
        System.out.println("multiplication="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("modulus="+(a%b));
    }
}



public class relational {
    public static void main(String[]args){
        int a=85;
        int b=70;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}





scanner for arithmetic



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number =");
        int a = sc.nextInt();

        System.out.println("Enter b number =");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}





public class logical {
    public static void main(String[] args) {
        int age = 20;
        boolean hashid = true;

        System.out.println(age >= 18 && hashid);
        System.out.println(age <= 18 || hashid);
        System.out.println(!hashid);
    }
}





public class assignment {
    public static void main(String[]args){
        int a=10;
        System.out.println(a);
        a=+5;
        System.out.println(a);
    }
}






public class ternary {
    public static void main(String[] args) {
        int a = 80;

        String result = (a >= 35) ? "pass" : "fail";

        System.out.println(result);
    }
}






public class unary {
    public static void main(String[] args) {
        int age = 20;
        boolean hashid = true;

        System.out.println(age >= 18 && hashid);
        System.out.println(age >= 18 || hashid);
        System.out.println(!hashid);
    }
}
