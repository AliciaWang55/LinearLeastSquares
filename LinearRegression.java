public class LinearRegression {

    // Method to calculate the slope (m) using the formula
    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        // Calculate required sums
        for (double[] point : data) {
            double x = point[0];
            double y = point[1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        // Calculate and return slope (m)
        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    // Method to calculate the y-intercept (b) using the formula
    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0;

        // Calculate sums of x and y
        for (double[] point : data) {
            sumX += point[0];
            sumY += point[1];
        }

        // Calculate slope (m) to compute intercept (b)
        double m = calcM(data);

        // Calculate and return y-intercept (b)
        return (sumY - m * sumX) / n;
    }
}
