import java.util.Scanner;

public class FBifElse {
    //выводим числа от 1 до 30 заменяя кратные 3 на fizz, 5 на Buzz, а 7 на Bang
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        sc.close();
        FBBP(j);
    }

    static void FBBP(int k){
        for (int i =1; i<=50; i++){
            if (i%3==0 && i%5==0 && i%7==0){
                System.out.println("FizzBuzzBang");
            } else if (i % 11 == 0 ) {
                System.out.println("Pow");
            } else if(i % 3 == 0 && i % 11 == 0){
                System.out.println("FizzPow");
            } else if (i%5==0 && i%7 ==0 ){
                System.out.println("BuzzBang");
            } else if (i%3==0 && i%7==0) {
                System.out.println("FizzBang");
            } else if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            } else if (i%7==0) {
                System.out.println("Bang");
            }
            else System.out.println(i);
        }
    }
}
