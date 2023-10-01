package org.patika;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveIslem(n, n);
    }

    static void recursiveIslem(int n, int originalN) {
        System.out.print(n + " ");

        if (n <= 0) {
            if (n < 0) {
                recursiveIslem(n + 5, originalN);
            }
        } else {
            recursiveIslem(n - 5, originalN);
        }

        if (n < originalN) {
            recursiveIslem(n + 5, originalN);
        }
    }
}