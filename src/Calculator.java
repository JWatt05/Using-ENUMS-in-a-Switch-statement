class Calculator {

    public int calculate(int a, int b, String operator) {
        int result = 0;
        Equation eq = Equation.valueOfLabel(operator);

        switch (eq) {
            case ADD ->
                    result = a + b;
            case SUB ->
                    result = a - b;
            case MUL ->
                    result = a * b;
            case DIV ->
                    result = a / b;
            default -> System.out.println("there was an issue");

        }
        return result;
    }
}