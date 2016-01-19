package p1;

public class Main {

    public static void main(String[] args) {

        final int NUM_OF_MONTHS = 12;

        double[] monthlySales = new double[NUM_OF_MONTHS];

        monthlySales[0] = 1590.75;
        monthlySales[1] = 7890.15;
        monthlySales[2] = 6090.15;
        monthlySales[3] = 5039.15;
        monthlySales[4] = 3249.14;
        monthlySales[5] = 2345.23;
        monthlySales[6] = 2111.50;
        monthlySales[7] = 2010.60;
        monthlySales[8] = 1950.79;
        monthlySales[9] = 1945.10;
        monthlySales[10] = 1915.67;
        monthlySales[11] = 1500.60;

        for (double each : monthlySales) {
            if (each != 0) {
                System.out.println(each);
            }
        }
    }
}