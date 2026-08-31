package behavioral.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        System.out.println("=== Interpreter Pattern ===");

        Expression expression =
                new AddExpression(
                        new NumberExpression(10),
                        new NumberExpression(20)
                );

        System.out.println(
                "10 + 20 = "
                        + expression.interpret()
        );

        Expression complexExpression =
                new SubtractExpression(
                        new AddExpression(
                                new NumberExpression(50),
                                new NumberExpression(25)
                        ),
                        new NumberExpression(15)
                );

        System.out.println(
                "(50 + 25) - 15 = "
                        + complexExpression.interpret()
        );
    }
}
