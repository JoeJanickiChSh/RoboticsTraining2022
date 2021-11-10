import java.util.Scanner;


public class Calc {

    static double mathEval(String inp) {
        double outNum = 0;
        double currentNum = 0; 
        char prevOperator = '+'; 
        boolean pointFlag = false;
        double place = 10;
        for(int i = 0; i < inp.length(); i++) {
            char cChar = inp.charAt(i);
            int cAsc = (int)cChar;
            if(cAsc >= (int)'0' && cAsc <= (int)'9') {
                if(!pointFlag) {
                    currentNum = currentNum*10 + (float)(cAsc - 48);
                } else {
                    currentNum += (float)(cAsc - 48) / place;
                    place*=10.;
                }
            } else if ( cChar == '.' ) {
                pointFlag = true;
            } else {
                switch(prevOperator) {
                    case '+':
                        outNum += currentNum;
                    break;
                    case '-':
                        outNum -= currentNum;
                    break;
                    case '*':
                        outNum *= currentNum;
                    break;
                    case '/':
                        outNum /= currentNum;
                    break;
                    case '%':
                        outNum %= currentNum;
                    break;
                }
                place = 10;
                pointFlag = false;
                prevOperator = cChar;
                currentNum = 0;
            }
        }
        return outNum;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String inString = scan.next();        
        System.out.println(mathEval(inString + "+"));
        scan.close();
    }
}