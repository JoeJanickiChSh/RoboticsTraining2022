package RoboticsTraining2022.FuncsClasses;

public class BigFloat {
    private String value;

    private boolean isDigit(char inChar) {
        if ((int) inChar >= 48 && (int) inChar <= 57) {
            return true;
        }
        return false;
    }

    public BigFloat(String inVal) {
        value = inVal;
    }

    public String getStringVal() {
        return value;
    }

    public void set(BigFloat inVal) {
        value = inVal.value;
    }

    public String[] getTwoValues(BigFloat inVal) {
        String beforePoint = "";
        String afterPoint = "";
        boolean wasPoint = false;
        for (int i = 0; i < inVal.value.length(); i++) {
            char c = inVal.value.charAt(i);
            if (c == '.') {
                wasPoint = true;
            } else if (isDigit(c)) {
                if (wasPoint) {
                    afterPoint = afterPoint + (((int) c) - 48);
                } else {
                    beforePoint = beforePoint + (((int) c) - 48);
                }
            }
        }
        return new String[] { beforePoint, afterPoint };
    }

    private String stringMul(String inString, int amt) {
        String outString = "";
        for (int i = 0; i < amt; i++) {
            outString = outString + inString;
        }
        return outString;
    }

    public void add(BigFloat inVal) {
        String selfBeforeDec = getTwoValues(this)[0];
        String selfAfterDec = getTwoValues(this)[1];
        String inBeforeDec = getTwoValues(inVal)[0];
        String inAfterDec = getTwoValues(inVal)[1];

        int beforeDif = Math.abs(selfBeforeDec.length() - inBeforeDec.length());
        int afterDif = Math.abs(selfAfterDec.length() - inAfterDec.length());

        int beforeMax = Math.max(selfBeforeDec.length(), inBeforeDec.length());
        int afterMax = Math.max(selfAfterDec.length(), inAfterDec.length());

        selfBeforeDec = (selfBeforeDec.length() == beforeMax) ? (selfBeforeDec)
                : (stringMul("0", beforeDif) + selfBeforeDec);
        inBeforeDec = (inBeforeDec.length() == beforeMax) ? (inBeforeDec) : (stringMul("0", beforeDif) + inBeforeDec);

        selfAfterDec = (selfAfterDec.length() == afterMax) ? (selfAfterDec) : (selfAfterDec + stringMul("0", afterDif));
        inAfterDec = (inAfterDec.length() == afterMax) ? (inAfterDec) : (inAfterDec + stringMul("0", afterDif));

        System.out.println(" " + selfBeforeDec + "." + selfAfterDec);
        System.out.println("+" + inBeforeDec + "." + inAfterDec);

    }
}
