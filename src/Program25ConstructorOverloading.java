public class Program25ConstructorOverloading {
    //Java program to overload constructors
    //   class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    //Student5
    Program25ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    //Student5
    Program25ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Program25ConstructorOverloading s1 = new Program25ConstructorOverloading(111, "Karan");
        Program25ConstructorOverloading s2 = new Program25ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}


