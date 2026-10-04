package Week04;

import java.util.Scanner;

public class CountingSort1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int[] count = new int[100];
        for (int i = 0; i < n; i++){
            count[a[i]]++;
        }
        for (int i = 0; i < 100; i++){
            System.out.print(count[i] + " ");
        }
        System.out.println();
    }

}
