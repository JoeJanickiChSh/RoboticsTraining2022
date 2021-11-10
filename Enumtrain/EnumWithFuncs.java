package RoboticsTraining2022.Enumtrain;

public class EnumWithFuncs {
    public static enum Height {
        LOW("Low", 0.0), MEDIUM("Medium", 2.7), HIGH("High", 3.14);

        private final double value;
        private final String name;

        Height(String name, double value) {
            this.value = value;
            this.name = name;
        }

        public double getDouble() {
            return this.value;
        }

        public String getString() {
            return this.name;
        }

        static Height getByName(String name) {
            if (name.equals("Low")) {
                return LOW;
            }
            if (name.equals("Medium")) {
                return MEDIUM;
            }
            if (name.equals("High")) {
                return HIGH;
            }
            return LOW;
        }
    }

    public static double calcPi() {
        double outPi = 0;
        for (int i = 1; i < 99999999; i++) {
            outPi += 1. / (((float) i) * ((float) i));
        }
        outPi *= 6;
        return Math.sqrt(outPi);
    }

    public static void goToHeight(Height h) {
        System.out.println(h.get());
    }

    public static void main(String args[]) {
        goToHeight(Height.LOW);
        goToHeight(Height.MEDIUM);
        goToHeight(Height.HIGH);
    }
}