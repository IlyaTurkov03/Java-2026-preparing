import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        ArrayList<String> output = Refractoring();
        for (String res : output) {
            System.out.println(res);
        }
    }

    public static ArrayList<String> Refractoring() {
        ArrayList<String> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces: ");
        String variable = sc.nextLine();
        String uni;
        if (variable.length() == 0) {
            System.out.println("You can't enter an empty line. Try again: ");
            variable = sc.nextLine();
        }
        //Base operations
        result.add("Length of this sting is: " + variable.length());
        result.add("UPPER type of string: " + variable.toUpperCase());
        result.add("LOWER type of string: " + variable.toLowerCase());
        //substring
        System.out.println("Enter the range of symbols to cut out: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        result.add("Cut part of string: " + variable.substring(a, b));
        String leftSide = variable.substring(0, a);
        String rightSide = variable.substring(b);
        result.add("Other sides: " + leftSide + rightSide);
        //contains, trim
        System.out.println("Enter a word to check if it is in the string: ");
        uni = sc.nextLine();
        result.add("Fact that this word is in the string is: " + variable.contains(uni));
        result.add("This string without spaces around: " + variable.trim());
        //replace
        System.out.println("Enter text to replace: old text than new text ");
        String fsPt = sc.nextLine();
        String scPt = sc.nextLine();
        result.add("String with changed word: " + variable.replace(fsPt, scPt));
        //split
        System.out.println("Enter separator: ");
        uni = sc.nextLine();
        result.add("Words" + Arrays.toString(variable.split(uni)));
        return result;
    }
}
