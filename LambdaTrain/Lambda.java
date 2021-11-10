package RoboticsTraining2022.LambdaTrain;

public class Lambda {
    @FunctionalInterface
    public static interface Calculator {
        double run(double d);
    }

    public static void main(String args[]) {
        Calculator operations[] = new Calculator[] { d -> d * 2, d -> -d, d -> d + 1, d -> d / 3.0 };
        for (Calculator op : operations) {
            System.out.println(op.run(0.5));
        }

    }
}
