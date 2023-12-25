public class Functions {
    public static void main(String[] args) {
        double y = 3;
        // A circle area
        // PI * r2
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(circleArea(y));

        // A sphere area
        // 4 * PI * r2
        System.out.println(sphereArea(y));

        // A sphere volume
        // (4/3) * PI * r3
        System.out.println(sphereVolume(y));

        // Convert currencies
        System.out.println("MEXICAN PESOS TO DOLLARS: " + convertToDollar(200, "MXN"));
        System.out.println("COLOMBIAN PESOS TO DOLLARS: " + convertToDollar(1000, "COP"));
    }

    // Single line comment

    /*
     *  Multi-Line
     *  Comment
     */

    /**
     * Description: This function receives a radius value to calculate the AREA of a CIRCLE
     * @param r it receives a radius value
     * @return return the result of 'PI * r2' formula.
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Description: This function receives a radius value to calculate the AREA of a SPHERE
     * @param r it receives a radius value
     * @return return the result of '4 * PI * r2' formula.
     */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Description: This function receives a radius value to calculate the VOLUME of a SPHERE
     * @param r it receives a radius value
     * @return return the result of '(4/3) * PI * r3' formula.
     */
    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Description: This function that specifying currency, converts its quantity into dollars
     * @param quantity Money quantity
     * @param currency Type of currency: IT ONLY ACCEPTS 'MXN' & 'COP'
     * @return param 'quantity' will return equivalence into american dollars
     */
    public static double convertToDollar(double quantity, String currency) {
        // MXN COP
        switch (currency) {
            case "MXN":
                quantity *= 0.059;
                break;
            case "COP":
                quantity *= 0.00025;
                break;
        }

        return quantity;
    }
}
