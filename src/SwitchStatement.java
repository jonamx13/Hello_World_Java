public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("You chose LIGHT mode");
                break;
            case "Night":
                System.out.println("You chose NIGHT mode");
                break;
            case "Blue Dark":
                System.out.println("You chose BLUE DARK mode");
                break;
            case "Dark":
                System.out.println("You chose DARK mode");
                break;
            default:
                System.out.println("Choose an option");
        }
    }
}
