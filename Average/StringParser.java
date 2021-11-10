package Average;


public class StringParser {
    public double mathEval(String inp) {
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
    public int[] parseInts(String inString){
        int spaceCount = 0;
        for(int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if(c == ' ') {
                spaceCount++;
            }
        }
        int outArray[] = new int[spaceCount+1];

        int numIndex = 0;
        int outNum = 0;

        for(int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if(c == ' ') {
                outArray[numIndex] = outNum;
                outNum = 0;
                numIndex++;
            } else if(  (int)c >= (int)'0' && (int)c <= (int)'9' ){
                outNum = outNum*10 + ((int)c - 48);
            }
        }
        outArray[numIndex] = outNum;


        return outArray;
    }
}
