package ex03;

public class Gugudan {
    public static void main(String[] args) {

        // for (int n = 2; n < 10; n++) {
        // System.out.println(n + "*1=" + n * 1);
        // System.out.println(n + "*2=" + n * 2);
        // System.out.println(n + "*3=" + n * 3);
        // System.out.println(n + "*4=" + n * 4);
        // System.out.println(n + "*5=" + n * 5);
        // System.out.println(n + "*6=" + n * 6);
        // System.out.println(n + "*7=" + n * 7);
        // System.out.println(n + "*8=" + n * 8);
        // System.out.println(n + "*9=" + n * 9);
        // System.out.println();

        // }

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + ",");

            }
            System.out.println(i + "*9=" + i * 9);
        }
    }

}
