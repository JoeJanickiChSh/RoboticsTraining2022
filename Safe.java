import java.util.Scanner;
public class Safe {
    static boolean checkSafe(int combination[]) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < combination.length; i++) {
            if(combination[i] != scan.nextInt()) {
                scan.close();
                
                return false;
            }
        }
        scan.close();
        return true;
    }
    public static void main(String args[]) {
        final int code[] = {42,65,23,463,732,74,86};
        System.out.println(checkSafe(code));
    }


    
}
