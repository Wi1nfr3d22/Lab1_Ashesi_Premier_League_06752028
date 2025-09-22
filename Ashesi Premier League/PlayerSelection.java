import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // == Task 1: Variables ==
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your jersey number: ");
        int jerseyNumber = input.nextInt();

        // == Task 2: Constant and Casting ==
        final double LB = 0.45359237;
        final int METER = 100;

        double heightInCm = height * METER;
        double weightInKg = weight * LB;
        int roundedWeightKg = (int) weightInKg;

        // == Task 3: Increment and Decrement ==
        System.out.println("\n--- Increment and Decrement ---");
        System.out.println("Current Age: " + age);
        age++;
        System.out.println("Age after one season: " + age);
        jerseyNumber--;
        System.out.println("Jersey number after penalty: " + jerseyNumber);

        // == Task 4: Boolean Expressions ==
        boolean isEligible = (age >= 18 && age <= 35 && weightInKg < 90);
        if (isEligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        boolean hasProblem = (age < 18 || weightInKg >= 90);
        if (hasProblem) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        if (!isEligible) {
            System.out.println("Not Eligible (using NOT)");
        }

        // == Task 5: Selection Statements ==
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("\nCategory: " + category);

        // == Task 6: Switch Case (Basic) ==
        String position;
        switch (jerseyNumber) {
            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Unknown"; break;
        }

        // == Task 8: Nested Ifs ==
        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (weightInKg < 80) {
                lineupDecision = "Starting Lineup";
            } else {
                lineupDecision = "Bench (overweight)";
            }
        } else {
            lineupDecision = "Bench (not Prime Player)";
        }

        // == Task 9: Ternary Operator ==
        String finalDecision = isEligible ? "Play" : "Rest";

        // == Task 10: Final Report ==
        System.out.println("\n=== PLAYER REPORT ===");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + (int) heightInCm + " cm");
        System.out.println("Weight: " + roundedWeightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Eligibility: " + (isEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);

        input.close();
    }
}