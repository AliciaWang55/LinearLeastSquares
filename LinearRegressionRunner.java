public class LinearRegressionRunner {
    public static void main(String[] args) {
        // Ice cream sales example (x: temperature, y: sales)
        double[][] iceCreamSalesData = {
            {30, 200}, 
            {40, 250}, 
            {50, 300}, 
            {60, 350}, 
            {70, 400}
        };

        // Calculate slope (m) and y-intercept (b)
        double m = LinearRegression.calcM(iceCreamSalesData);
        double b = LinearRegression.calcB(iceCreamSalesData);

        // Display the results
        System.out.printf("Calculated Slope (m): %.4f%n", m);
        System.out.printf("Calculated Y-Intercept (b): %.4f%n", b);

        // Show the linear regression equation
        System.out.printf("Linear Regression Equation: y = %.4fx + %.4f%n", m, b);
    }
}
