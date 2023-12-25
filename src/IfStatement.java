public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSent = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSent++;
            System.out.println("File sent");

            int i = 0;
            i++;
            System.out.println(i);
        } else {
            fileSent--;
            System.out.println("Please turn on Bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
        // System.out.println(i); this variable can't be reached due to its scope.
    }
}
