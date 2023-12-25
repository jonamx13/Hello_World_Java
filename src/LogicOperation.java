public class LogicOperation {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // Assignation operators
        System.out.println("Is a is equal to b? -> " + (a == b));
        System.out.println("Is a different to be? ->" + (a != b));

        // Relational operators
        System.out.println("Is a greater than b? -> " + (a > b));
        System.out.println("Is a lower than b? -> " + (a < b));
        System.out.println("Is a greater or equal to b? -> " + (a >= b));
        System.out.println("Is a lower or equal t0 b? -> " + (a <= b));

        if (a == b) {
            System.out.println("a is equal to b");
        } else if ((a != b) && (a < b)) {
            System.out.println("a is different to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is lower than b");
        } else if (a >= b) {
            System.out.println("a is greater or equal to b");
        } else if (a <= b) {
            System.out.println("a is lower or equal to b");
        }
    }
}
