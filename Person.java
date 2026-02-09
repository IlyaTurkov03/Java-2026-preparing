import java.util.Scanner;

public class Person{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     //  Person p1 = new Person(); last version
        Person[] people = new Person[3];

        for (int i = 0; i<3; i++) {
            people[i] = new Person();
            System.out.println("Enter age: ");
            people[i].age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name ");
            people[i].name = sc.nextLine();

            people[i].SayHello();
        }

     //  p1.SayHello(); last version
    }
    String name;
    int age;

    void SayHello(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old");
    }

}