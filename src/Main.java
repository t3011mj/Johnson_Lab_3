import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        long inputNumber = 0;
        long numberSquared = 0;
        long numberCubed = 0;
        String answer = "Y";
        boolean checkNumber = false;

        Scanner scnr = new Scanner(System.in);

        while (answer.equalsIgnoreCase("Y")) {

            while (checkNumber == false) {

                // Get integer from user
                System.out.println("Enter an integer between 1 - 1000");
                // scnr.nextInt();
                inputNumber = scnr.nextInt();
                if (inputNumber <= 1000) {
                    checkNumber = true;
                }
                  else{
                        System.out.println("Invalid number was input");
                        checkNumber = false;
                    }
            }
            System.out.printf("%-12s%-12s%s\n", "Number:", "Squared:", "Cubed:");
            System.out.printf("%-12s%-12s%s\n", "======", "=======", "=======");

            for (i = 1; i <= inputNumber; ++i) {
                numberSquared = i * i;
                numberCubed = i * i * i;

                System.out.printf("%-12d%-12d%-7d\n", i, numberSquared, numberCubed);
            }

            System.out.println("Continue (y/n):");
            scnr.nextLine();
            answer = scnr.nextLine();
            checkNumber = false;
        }
    }
}
