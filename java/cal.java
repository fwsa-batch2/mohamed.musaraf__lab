import java.util.*;

public class cal {

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner firstNum = new Scanner(System.in);
        int first = firstNum.nextInt();
        System.out.println("enter operator");
        int operator = firstNum.nextInt();
        System.out.println("enter second Number");
        int sec = firstNum.nextInt();
        int sum1 = add(first, sec);
        int sum2 = sub(first, sec);
        int sum3 = multiply(first, sec);
        int sum4 = divide(first, sec);


        if (operator == 1) {
            System.out.println("Addition : " + sum1);
        } else if (operator == 2) {
            System.out.println("Subtraction : " + sum2);
        } else if (operator == 3) {
            System.out.println("Multiplication : " + sum3);
        } else if (operator == 4) {
            System.out.println("Division : " + sum4);

        } else {
            System.out.println("syntax error");
        }
        firstNum.close();
    }

    public static int add(int num1, int num2) {
        int sum1 = num1 + num2;
        return sum1;
    }

    public static int sub(int num1, int num2) {
        int sum2 = num1 - num2;
        return sum2;
    }
    public static int multiply(int num1, int num2) {
        int sum3 = num1 * num2;
        return sum3;
    }
    public static int divide(int num1, int num2) {
        int sum4 = num1 / num2;
        return sum4;
    }


}