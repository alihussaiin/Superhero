import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("press 1 if you want to create a superhero");
        System.out.println("press 2 if you want to exit the program");

        int UserInput = scan.nextInt();
        scan.nextLine();

        if (UserInput == 1) {
            Superhero superhero = new Superhero("stol", "bord", 1990, true, 50);

            System.out.println("Enter secretIdentity");
            String secretIdentity = scan.next();
            superhero.setSecretIdentity(secretIdentity);


            System.out.println("Enter realName");
            String realName = scan.next();
            superhero.setRealName(realName);


            System.out.println("Enter superPower");
            String superPower = scan.next();
            superhero.setSuperPower(superPower);


            System.out.println("Enter yearCreated");
            int yearCreated = scan.nextInt();
            superhero.setyearCreated(yearCreated);

            System.out.println("Is the superhero human? (true/false):");
            boolean isHuman = scan.nextBoolean();
            superhero.setisHuman(isHuman);

            System.out.println("Enter strength (1-10):");
            int strength = scan.nextInt();
            superhero.setStrength(strength);

            System.out.println("Superhero created:");
            System.out.println(superhero);
        } else if (UserInput == 2) {
            System.out.println("Exiting the program");
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }

        scan.close(); // Luk scanneren


    }
}