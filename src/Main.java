//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Using Weights.java
        Weights weights1 = new Weights("Mars", 0.38, 0);
        Weights weights2 = new Weights("Venus", 0.90, 0);
        Weights weights3 = new Weights("Jupiter", 2.40, 0);

        Weights[] data = new Weights[3];

        data[0] = weights1;
        data[1] = weights2;
        data[2] = weights3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight? ");
        int weight = scanner.nextInt();

        System.out.println("\nMake a selection:\n1. Mars\n2. Venus\n3. Jupiter\nSelection:");
        int selection = scanner.nextInt();
        selection -= 1;
        scanner.close();

        data[selection].setWeight(weight);
        double multiplier = data[selection].getGravity();
        double lbs = data[selection].getWeight();

        double final_weight = data[selection].multi(multiplier, lbs);
        System.out.println("\nYour weight on " + data[selection].getPlanet() + " is " + final_weight);
    }
}
