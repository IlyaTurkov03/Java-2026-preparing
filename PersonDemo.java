import java.util.Scanner;

    public class PersonDemo{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int sz = sc.nextInt();
            sc.nextLine();
            Person[] people = new Person[sz];
            for (int i =0; i< people.length; i++){
                System.out.println("Enter the name of the person: ");
                String name = sc.nextLine();
                System.out.println("Enter the age of the person: ");
                int age = sc.nextInt();
                sc.nextLine();
                people[i] = new Person(name, age);
            }
            System.out.println("People with name length > 4 and age >= 18");
            for (Person p : people){
                if(p.name.length() > 4 && p.age >=18){
                    System.out.println("Hello, my name is " + p.name + " and my age is " + p.age );
                }
            }
            Person oldest = people[0];
            Person youngest = people[0];
            for (int i =1; i<sz; i++){
                Person current = people[i];
                if (current.age < youngest.age){
                    youngest = current;
                }
                if (current.age > oldest.age){
                    oldest = current;
                }
            }
            System.out.println("Oldest person: " + oldest.name + ", age: " + oldest.age);
            System.out.println("Youngest person: " + youngest.name + ", age: " + youngest.age);
        }
    }

    class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }