public class MathematicalOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Returns an int upwards
        System.out.println(Math.ceil(x));

        // Returns an int downwards
        System.out.println(Math.floor(x));

        // Returns a number elevated by another one
        System.out.println(Math.pow(x,y));

        // Returns the highest number
        System.out.println(Math.max(x,y));

        // Returns the square root
        System.out.println(Math.sqrt(y));

        // A circle area
        // PI * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // A sphere area
        // 4 * PI * r2
        System.out.println( 4 * Math.PI * Math.pow(y,2));

        // A sphere volume
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}
