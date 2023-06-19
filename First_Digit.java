package even_number;

import java.util.Scanner;


public class First_Digit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = s.nextInt();
        int y = 0;
        while (x > 0) {
            y = x % 10;
            x = x / 10;
        }
        System.out.println("First digit is =" + y);
    }
}
