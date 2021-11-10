package RoboticsTraining2022;

public class Fib {
    public static void main(String args[]) {
        int mem[] = new int[30000];
        int ptr = 0;
        ptr += 8;
        mem[ptr] += 5;
        mem[ptr] %= 256;
        while (mem[ptr] != 0) {
            ptr -= 1;
            mem[ptr] += 2;
            mem[ptr] %= 256;
            ptr += 1;
            mem[ptr] -= 1;
            mem[ptr] %= 256;
        }
        ptr -= 8;
        ptr += 3;
        mem[ptr] += 1;
        mem[ptr] %= 256;
        ptr += 4;
        while (mem[ptr] != 0) {
            ptr -= 7;
            ptr += 3;
            while (mem[ptr] != 0) {
                ptr -= 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 1;
            while (mem[ptr] != 0) {
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 1;
            ptr -= 4;
            while (mem[ptr] != 0) {
                ptr -= 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 1;
            while (mem[ptr] != 0) {
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                ptr += 3;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 3;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 1;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                ptr -= 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 2;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                ptr -= 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 2;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 2;
            while (mem[ptr] != 0) {
                ptr -= 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 1;
            while (mem[ptr] != 0) {
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 7;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 5;
            while (mem[ptr] != 0) {
                ptr += 5;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr -= 5;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 7;
            mem[ptr] += 10;
            mem[ptr] %= 256;
            ptr -= 2;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                while (mem[ptr] != 0) {
                    ptr += 1;
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    ptr += 2;
                }
                ptr += 1;
                while (mem[ptr] != 0) {
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    while (mem[ptr] != 0) {
                        mem[ptr] -= 1;
                        mem[ptr] %= 256;
                        ptr -= 1;
                        mem[ptr] += 1;
                        mem[ptr] %= 256;
                        ptr += 1;
                    }
                    ptr += 1;
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    ptr += 2;
                }
                ptr -= 6;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 3;
            mem[ptr] += 10;
            mem[ptr] %= 256;
            ptr -= 1;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                ptr += 1;
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                while (mem[ptr] != 0) {
                    ptr += 1;
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    ptr += 2;
                }
                ptr += 1;
                while (mem[ptr] != 0) {
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    while (mem[ptr] != 0) {
                        mem[ptr] -= 1;
                        mem[ptr] %= 256;
                        ptr -= 1;
                        mem[ptr] += 1;
                        mem[ptr] %= 256;
                        ptr += 1;
                    }
                    ptr += 1;
                    mem[ptr] += 1;
                    mem[ptr] %= 256;
                    ptr += 2;
                }
                ptr -= 5;
            }
            ptr += 1;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr += 2;
            while (mem[ptr] != 0) {
                ptr += 1;
                mem[ptr] += 6;
                mem[ptr] %= 256;
                while (mem[ptr] != 0) {
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                    ptr -= 1;
                    mem[ptr] += 8;
                    mem[ptr] %= 256;
                    ptr += 1;
                }
                ptr -= 1;
                System.out.print((char) mem[ptr]);
                ptr -= 2;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 1;
                while (mem[ptr] != 0) {
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                }
            }
            ptr -= 1;
            while (mem[ptr] != 0) {
                ptr -= 1;
                while (mem[ptr] != 0) {
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                    ptr += 1;
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                    ptr -= 1;
                }
                mem[ptr] += 6;
                mem[ptr] %= 256;
                while (mem[ptr] != 0) {
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                    ptr += 1;
                    mem[ptr] += 8;
                    mem[ptr] %= 256;
                    ptr -= 1;
                }
                ptr += 1;
                System.out.print((char) mem[ptr]);
                while (mem[ptr] != 0) {
                    mem[ptr] -= 1;
                    mem[ptr] %= 256;
                }
            }
            ptr -= 2;
            mem[ptr] += 6;
            mem[ptr] %= 256;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] += 8;
                mem[ptr] %= 256;
                ptr += 1;
            }
            ptr -= 1;
            System.out.print((char) mem[ptr]);
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 2;
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
                ptr -= 1;
                mem[ptr] += 1;
                mem[ptr] %= 256;
                ptr += 1;
            }
            ptr -= 1;
            ptr += 2;
            mem[ptr] += 10;
            mem[ptr] %= 256;
            System.out.print((char) mem[ptr]);
            while (mem[ptr] != 0) {
                mem[ptr] -= 1;
                mem[ptr] %= 256;
            }
            ptr -= 4;
            mem[ptr] -= 1;
            mem[ptr] %= 256;
        }
    }
}