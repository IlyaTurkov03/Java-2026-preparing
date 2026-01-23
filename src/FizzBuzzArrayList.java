import java.util.ArrayList;
import java.util.Scanner;





public class FizzBuzzArrayList {

    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("До какого числа FizzBuzz");
        int maxLenght = length.nextInt();
        length.close();

        ArrayList<String> result = fizzBuzz(maxLenght);
        for (String line : result){
            System.out.println(line);
        }
    }

    //проверить пустой вариант ответа
    //объявить лист, провести проверку условия с его помощью, создать вывод и отдельный цифровой вывод для неподходящих значений
    public static ArrayList<String> fizzBuzz(int limit) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            ArrayList<String> words = new ArrayList<>();
            if (i % 3 == 0) words.add("Fizz");
            if (i % 5 == 0) words.add("Buzz");
            if (i % 7 == 0) words.add("Bang");
            if (i % 11 == 0) words.add("Pow");

            if (words.isEmpty()) {
                result.add("" + i);
            } else {
                result.add(String.join("",   words ));
            }

        }
        return result;
    }
}
