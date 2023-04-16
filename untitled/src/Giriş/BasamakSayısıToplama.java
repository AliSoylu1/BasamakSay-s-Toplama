package Giriş;

import java.util.Scanner;

public class z5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 1453, sayac = 0; int sonuc = 0;
        while (n != 0) {
            sayac++;
           int k = n;
            k = (n % 10);
            n /= 10;

           sonuc = k + sonuc;
        } System.out.println(sonuc);



    }
}
