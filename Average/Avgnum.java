package RoboticsTraining2022.Average;

import java.util.Scanner;

public class Avgnum {
    public static int intAvg(int nums[]) {
        int outAvg = 0;
        for (int i = 0; i < nums.length; i++) {
            outAvg += nums[i];
        }
        return outAvg / nums.length;
    }

    public static int fact(int in) {
        int outn = 0;
        for (int i = 1; i < in + 1; i++) {
            outn += 1;
        }
        return outn;
    }

    public static void main(String args[]) {

        System.out.println(fact(5));
        Scanner scan = new Scanner(System.in);
        int nums[] = (new StringParser()).parseInts(scan.nextLine());
        System.out.println(intAvg(nums));
        System.out.println(intAvg(new int[] { nums[0], nums[2], 42 }));
        System.out.println(intAvg(new int[] { nums[1], nums[1], 7 }));
        scan.close();
    }
}