import java.util.Scanner;

public class DogAdoption {
    public static void main(String[] args) {

        Dog TrueGrit = new Dog("TrueGrit", "brown", "Cheseapeake Bay Retriever", 67.0 , 7);
        Dog Snowball = new Dog("Snowball", "white", "Spitz", 23.0, 3);

       System.out.println("Welcome to the dog adoption center, there are two dogs to choose from:");

        System.out.println(TrueGrit.name + " is a " + TrueGrit.weight + " lb " + TrueGrit.color + " " + TrueGrit.breed + ". She is " + TrueGrit.age + " years old.");
        System.out.println(Snowball.name + " is a " + Snowball.weight + " lb " + Snowball.color + " " + Snowball.breed + ". She is " + Snowball.age + " years old.");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which dog would you like to adopt? (TrueGrit or Snowball)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("TrueGrit")) {
            System.out.println("You chose to adopt " + TrueGrit.name + "!");
            System.out.println("Her adoption fee is " + String.format("%.2f", TrueGrit.getAdoptionFee()));
        } else if (choice.equalsIgnoreCase("Snowball")) {
            System.out.println("You chose to adopt " + Snowball.name + "!");
            System.out.println("Her adoption fee is " + String.format("%.2f", Snowball.getAdoptionFee()));
        } else {
            System.out.println("Invalid choice. Please choose either TrueGrit or Snowball.");
        }

        scanner.close();

    }
}

class Dog {
    String breed;
    String name;
    String color;
    double weight;
    int age;

    public Dog(String name, String color, String breed, double weight, int age) {

        this.breed = breed;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;

    }

    public double getAdoptionFee() {
        return 12.16 * weight/age;
    }
}