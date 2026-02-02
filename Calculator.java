import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        ArrayList<String> history = calculate();
        for (String operation : history) {
            System.out.println(operation);
        }
    }
    public static ArrayList<String> calculate() {
        ArrayList<String> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            System.out.println("What do you want to do: 1:+, 2:-, 3:*, 4:/, 5:0 - выход");
            int choice = sc.nextInt();
            if (choice == 0) return answer;
            System.out.println("Enter variable a: ");
            a = sc.nextInt();
            System.out.println("Enter variable b: ");
            b = sc.nextInt();
            String operation = "";
            int result = 0;
                switch (choice) {
                    case 1:
                        result = a + b;
                        operation = a + " + " + b + " = " + result;
                        break;
                    case 2:
                        result = a - b;
                        operation = a + " - " + b + " = " + result;
                        break;
                    case 3:
                        result = a * b;
                        operation = a + " * " + b + " = " + result;
                        break;
                    case 4:
                        try {
                            result = a / b;
                        } catch (ArithmeticException e) {
                            System.out.println("You cannot devide by zero");
                            break;
                        }
                        operation = a + " / " + b + " = " + result;
                        break;
                    default:
                        operation = "Error! Input is out of range";
                }
                answer.add(operation);
                System.out.println(operation + "\n");
        }
    }
}

