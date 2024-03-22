public class Area {
    public double calculate(int N) {
        if (N % 2 == 0) {
            return N * N;
        } else if (N % 3 == 0) {
            return Math.PI * N * N;
        } else {
            double height = Math.sqrt(3) / 2 * N;
            return 0.5 * N * height;
        }
    }

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        int input1 = 4;
        int input2 = 6;
        int input3 = 5;

        double result1 = areaCalculator.calculate(input1);
        double result2 = areaCalculator.calculate(input2);
        double result3 = areaCalculator.calculate(input3);

        System.out.println("Area for input1: " + result1);
        System.out.println("Area for input2: " + result2);
        System.out.println("Area for input3: " + result3);
    }
}
