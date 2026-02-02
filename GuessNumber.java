import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
 static void main(String[] args) {
    Random rand = new Random();
    int secret = rand.nextInt(101);
    main(secret);


}
        public static ArrayList<String> main (int guessed){
            ArrayList<String> history = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int attempt = 0;
            while (true){
                attempt++;
                System.out.println("Attempt number: " + attempt + "\nEnter guessed number(0-100): ");
                int guess = sc.nextInt();
                history.add("" + guess);
                if (guess >100 || guess<0){
                    System.out.println("Out of range");
                    continue;
                }
                if (guess == guessed){
                    System.out.println("Great! Guessed number: " + guessed + ".\nNumber of attempts: " + attempt);
                    System.out.print("History attempts: ");
                    for (String evTry : history){
                        System.out.print(evTry + " ");
                    }
                    break;
                }
                else {
                    if (guess > guessed){
                        System.out.println("Guessed number is lower, try again: ");
                    }
                    else {
                        System.out.println("Guessed number is higher, try again: ");
                    }
                }
            }
           return history;
        }
    }
