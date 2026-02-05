import java.util.Scanner;
import java.util.ArrayList;

class CalculatorOOP{

    public static void main(String[] args){
        ArrayList<String> result = new ArrayList<>();
        result = new calculate().counted();

        for (String each : result){
            System.out.println(each);
        }
    }

    public static class calculate{
        ArrayList<String> counted(){
            ArrayList<String> history = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            while (true){
                System.out.println("Enter a number of operation: 1:+, 2:-, 3:*, 4:/, 0: exit");
                int variable = sc.nextInt();
                int uni;
                if (variable == 0) break;
                System.out.println("Enter two nums to operate with: ");
                a = sc.nextInt();
                b = sc.nextInt();
                switch (variable){
                    default: history.add("Your value is out of range: try again!");
                        break;
                    case 1:
                        history.add(a + " plus " + " b " + " = " + (a+b));
                        break;
                    case 2:
                        history.add(a + " minus " + " b " + " = " + (a-b));
                        break;
                    case 3:
                        history.add(a + " times " + b + " = " + a*b);
                        break;
                    case 4:
                        try {
                            uni = a/b;
                        }
                        catch (ArithmeticException e){
                            System.out.println("You can't divide by zero!");
                            break;
                        }
                        history.add(a + " divided " + b + " = " + (a/b));
                        break;
                }
            }
            return history;
        }
    }
}
