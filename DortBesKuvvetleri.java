package Giris;
import java.util.Scanner;

public class DortBesKuvvetleri {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("sinirr sayisi giriniz:");
        n = input.nextInt();


        while (i <= n) {
            if (i < n) {
                System.out.println("4 un kuvvetleri :" + i);
                i *= 4;
            }

        }
        while (j <= n) {
            if (j < n) {

                System.out.println("5 un kuvvetleri :" + j);
                j *= 5;

            }

        }
    }


    }

