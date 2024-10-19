import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CropNotAvailableException extends Exception {
    public CropNotAvailableException(String message) {
        super(message);
    }
}

System.out.println("Welcome to the Farm Game! You start with " + farmer.getCoins() + " coins.");
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Farmer plants crops");
            System.out.println("2. Helper feeds animals");
            System.out.println("3. Harvest crops");
            System.out.println("4. Buy new crops or animals");
            System.out.println("5. Check worker status and coins");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();
