package Week02;

import java.util.Scanner;

public class two_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < n){
            if (a[i]==b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
    }
}
