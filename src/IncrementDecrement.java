public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives -= 1 ;
        System.out.println(lives); // 4

        lives--; // Decrement
        System.out.println(lives); // 3

        lives++; // Increment
        System.out.println(lives); // 4

        // Prefixed
        // Wins a gift for getting a life
        int gift = 100 + ++lives; // Prefixed
        System.out.println(gift);
        System.out.println(lives); // 5
    }
}
