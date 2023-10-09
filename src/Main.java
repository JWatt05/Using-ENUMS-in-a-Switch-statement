public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.calculate(5, 9, "add");
        result = calc.calculate(result, 50, "mul");
        System.out.println(result);
    }
}