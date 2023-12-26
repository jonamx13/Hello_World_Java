import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 1;
        do {
            System.out.println("Select a number for the wished choice");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Tanks for visiting us");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        } while (response != 0);

        System.out.println("Program finished");
    }
}
