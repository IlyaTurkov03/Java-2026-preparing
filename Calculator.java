import java.util.ArrayList;
import java.util.Scanner;

/* Мне нужен оператор свич для реализации ввода разных кейсов, + - * /
арайЛист нужен для сохранения истории по прежнему паттерну из инпутРнадНам
записываем промежуточные результаты в переменную хистори
потом проходимся стринговой переменной джава лайк циклом по хистори
и возвращаем в качестве ответа результат работы этого цикла
для реализации задуманного мне нужно объявить сканнер, который вызывается перед свичём
на вход мы подаём переменную выбора операции, далее вывод формата "введите переменные для + "выбранная операция""
возврат формата "число + число + число... = ответ"
*/


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
            System.out.println("Введите желаемую операцию: 1:+, 2:-, 3:*, 4:/, 5:0 - выход");
            int choice = sc.nextInt();
            if (choice == 0) return answer;
            System.out.println("Введите переменную a: ");
            a = sc.nextInt();
            System.out.println("Введите переменную b: ");
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
                            System.out.println("Ошибка деления на 0");
                            break;
                        }
                        operation = a + " / " + b + " = " + result;
                        break;
                    default:
                        operation = "Ошибка! Введите значение из указанного списка";
                }
                answer.add(operation);
                System.out.println(operation + "\n");
        }
    }
}

