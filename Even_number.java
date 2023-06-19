package even_number;

import java.util.Scanner;

public class Even_number {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
        }
    }
}

