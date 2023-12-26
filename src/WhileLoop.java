public class WhileLoop {
    static boolean isLightTurnedOn = false;
    public static void main(String[] args) {
        turnOnOffLight();

        int i = 0;
        while(isLightTurnedOn && i<=10) {
            printSOS();
            i++;
        }
    }
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight() {
        isLightTurnedOn = (isLightTurnedOn) ? false : true;
        return  isLightTurnedOn;
    }
}
