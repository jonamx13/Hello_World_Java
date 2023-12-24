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

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) nI;
        System.out.println(nS);

    }
}
