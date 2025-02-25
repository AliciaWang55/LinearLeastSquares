public class LinearRegressionRunner {
    public static void main(String[] args) {
        // Ice cream sales example (x: temperature, y: sales)
        double[][] iceCreamSalesData = {
            {14.2, 215}, 
            {16.4, 325}, 
            {11.9, 185}, 
            {15.2, 332}, 
            {18.5, 406},
            {22.1, 522},
            {19.4, 412},
            {25.1, 614},
            {23.4, 544},
            {18.1, 421},
            {22.6, 445},
            {17.2, 408}
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
