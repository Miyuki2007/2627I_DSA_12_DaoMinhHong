package Week02;

import java.util.Scanner;
import java.util.Arrays;

public class closest_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);

        double min_value = Double.MAX_VALUE;
        double num1 = a[0];
        double num2 = a[1];


        for (int i = 1; i < n; i++) {
            double tam = a[i] - a[i - 1];

            if (tam < min_value) {
                min_value = tam;
                num1 = a[i - 1];
                num2 = a[i];
            }
        }

        System.out.println("Cặp số gần nhất là: " + num1 + " và " + num2);
        System.out.println(min_value);
        sc.close();
    }
}