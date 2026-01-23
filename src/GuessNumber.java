import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
 static void main(String[] args) {
    //вообще зачем тут арайЛист
    //затем, что я не знаю, сколько попыток потребуется для угадывания числа
    //мне нужна динамическая переменная, чтобы независимо от того, с первой ли, с сотой ли попытки пользователь попадёт в нужное число
    //всё работало хорошо, плюс сделать код более читаемым и чистым, чтобы в нём были реализованы не простые if/else
    //а действительно вещи уровня программиста, а не урока информатики 8 класса в деревенской школе


    // арайЛист для history мне нужен, чтобы сохранить записи о неудачных попытках и вывести введённые данные в конце для наглядности

    //здесь я импортирую рандом, чтобы передавать загаданное число в класс, в уже готовом виде, а не создавать его в рамках
    //реюзабельного кода. Мне кажется, что это сделает программу динамичнее, она станет более сговорчива к изменениям, т.к
    //основной этап будет проходить вне реиспользуемого отрезка кода
    Random rand = new Random();
    int secret = rand.nextInt(101);
    main(secret);


}
        public static ArrayList<String> main (int guessed){//сюда я подам переменную secret
            ArrayList<String> history = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int attempt = 0;
            while (true){
                attempt++;
                System.out.println("Попытка номер: " + attempt + "\nВведите предполагаемое число(0-100): ");
                int guess = sc.nextInt();
                history.add("" + guess);
                if (guess >100 || guess<0){
                    System.out.println("Число за пределами указанного диапазона");
                    continue;
                }
                if (guess == guessed){
                    System.out.println("Угадал! Загаданное число: " + guessed + ".\nКоличество попыток: " + attempt);
                    System.out.print("История попыток: ");
                    for (String evTry : history){
                        System.out.print(evTry + " ");
                    }
                    break;
                }
                else {
                    if (guess > guessed){
                        System.out.println("Загаданное число меньше, введите ещё раз: ");
                    }
                    else {
                        System.out.println("Загаданное число больше, введите ещё раз: ");
                    }
                }
            }
           return history;
        }
    }