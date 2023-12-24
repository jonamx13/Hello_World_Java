public class Casting {
    public static void main(String[] args) {
        // Located 30 dogs in a year
        // How many did I locate monthly?

        double monthlyDog = 30.0/12.0;
        System.out.println(monthlyDog);

        // Estimation
        int estimatedMonthlyDogs = (int) monthlyDog;
        System.out.println(estimatedMonthlyDogs);

        // Precision
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
    }
}
