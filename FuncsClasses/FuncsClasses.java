package RoboticsTraining2022.FuncsClasses;

public class FuncsClasses {

    public static enum Direction {
        FORWARD, NEUTRAL, REVERSE
    }

    public static interface Displayable {
        String getString();
    }

    public static class Motor implements Displayable {
        private double speed;

        public void setSpeed(double inSpeed) {
            this.speed = Math.min(1.0, Math.max(-1.0, inSpeed));
        }

        public double getSpeed() {
            return this.speed;

        }

        public String getString() {
            return String.valueOf(this.speed);
        }
    }

    public static class MotorGroup extends Motor {
        Motor[] motorArray;

        public MotorGroup(Motor... inMotors) {
            this.motorArray = inMotors;
        }

        public double getSpeeds() {
            double outSpeed = 0;
            for (Motor m : this.motorArray) {
                outSpeed += m.getSpeed();
            }
            return outSpeed / this.motorArray.length;
        }

        public void setSpeeds(double inSpeed) {
            for (Motor m : this.motorArray) {
                m.setSpeed(inSpeed);
            }
        }
    }

    public static class DoubleSolenoid implements Displayable {
        private Direction state;

        public String getString() {
            switch (this.state) {
                case FORWARD:
                    return "FORWARD";

                case NEUTRAL:
                    return "NEUTRAL";

                case REVERSE:
                    return "REVERSE";

                default:
                    return "null you messed up idk how to help you";

            }
        }

        public void setState(Direction state) {
            this.state = state;
        }

        public Direction getState() {
            return this.state;
        }
    }

    public static class Solenoid {
        private boolean active;

        public void setActive(boolean inState) {
            this.active = inState;
        }

        public boolean isAcrive() {
            return this.active;
        }
    }

    public static void main(String args[]) {
    }
}