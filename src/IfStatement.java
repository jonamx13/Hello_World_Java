public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSent = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSent++;
            System.out.println("File sent");
        }
    }
}
