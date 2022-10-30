import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, k, j, l, m, n, number;
        System.out.print("Bir sayı giriniz`: ");
        number = scan.nextInt();
        for (i = 0; i <= number; i++) {
            for (k = 0; k < (number - i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i = 0; i <= number; i++) {
            for (k = 0; k <= (number - i); k++) {
                System.out.print("*");
            }
            for (j = 1; j < (2 * i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    }

