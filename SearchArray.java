import java.util.Scanner;

class SearchArray{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int k = sc.nextInt();
        sc.nextLine();
        SearchArray[] people = new SearchArray[k];

        for (int i =0; i<k; i++){
            people[i] = new SearchArray();
            System.out.println("Enter the name of the person:");
            people[i].name = sc.nextLine();
            System.out.println("Enter the age of the person:");
            people[i].age = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter a name to find: ");
        String nm = sc.nextLine();
        for (int i = 0; i<k; i++){
            if(people[i].name.equalsIgnoreCase(nm)) {
                people[i].SayHello();
                return;
            }
        }
        System.out.println("Not found");
    }
    String name;
    int age;

    public void SayHello(){
        System.out.println("Hello " + name + " is here.");
    }
}