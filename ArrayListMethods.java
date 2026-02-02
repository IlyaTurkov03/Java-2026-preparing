import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<String> output = loopThrow();
        for (String each : output){
            System.out.println(each);
        }
    }

    public static ArrayList<String> loopThrow() {
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int maxLength = sc.nextInt();
        for (int i = 0; i < maxLength; i++) {
            System.out.println("Enter element " + i + ":");
            elements.add(sc.nextInt());
        }
        int uni;
        System.out.println("Enter an index of element to get it's value: ");
        uni = sc.nextInt();
        if (uni >= elements.size() || uni <0) {
            System.out.println("This value is out of range. Try again: ");
            uni = sc.nextInt();
        } else {
            result.add("Element at index " + uni + " is " + elements.get(uni));
        }
            System.out.println("Enter a number of element to check if it's exist: ");
            uni = sc.nextInt();
            result.add("Fact that current array contains element at " + uni + " is " + elements.contains(uni));
            System.out.println("Enter an index of element to remove it");
            uni = sc.nextInt();
        if (uni >= elements.size() || uni <0) {
            System.out.println("This value is out of range. Try again: ");
            uni = sc.nextInt();
        } else {
            result.add("Deleted element is " + elements.get(uni));
            elements.remove(uni);
        }
            for (int el : elements) {
                result.add("" + el);
            }
            return result;
        }
    }


