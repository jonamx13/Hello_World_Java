public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Bonus $200
        salary += 200;
        System.out.println(salary);

        // Pension: $50 discount
        salary -= 50;
        System.out.println(salary);

        // 2 extra hours $30 each
        // Food: $45
        salary += (30*2) - 45;
        System.out.println(salary);

        // Updating Strings
        String employeeName = "Eduardo Olivas";
        employeeName += " Meixueiro";
        System.out.println(employeeName);

        employeeName = "Jonathan " + employeeName;
        System.out.println("Your name is: " + employeeName);
    }
}
