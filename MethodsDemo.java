
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsDemo{
    public static void main(String[] args){
        ArrayList<String> outP = new ArrayList<>();
        outP = new Calculator().calculate();

        for (String i : outP){
            System.out.println(i);
        }
    }

    static class Calculator{
        ArrayList<String> calculate(){
            ArrayList<String> res = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            System.out.println("Enter two nums to add: ");
            a = sc.nextInt();
            b = sc.nextInt();
            res.add(a + " add " + b + " = " + (a+b));
            System.out.println("Enter two nums to multiply ");
            a = sc.nextInt();
            b = sc.nextInt();
            res.add(a + " times " + b + " = " + a*b);
            System.out.println("Enter two nums to substruct: ");
            a = sc.nextInt();
            b = sc.nextInt();
            res.add(a + " substruction " + b + " = " + (a-b));

            return res;
        }
    }
}
