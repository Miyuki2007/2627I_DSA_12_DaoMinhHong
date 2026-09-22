package Week02;

import java.util.Scanner;
import java.util.Arrays;
public class count_pair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int result = 0;
        int i = 0;
        while(i < n){
            int count = 1;
            while (i + 1 < n && a[i] == a[i+1]){
                count++;
                i++;
            }
            if (count > 1){
                result += (count*(count-1))/2;
            }
            i++;
        }
        System.out.println(result);
    }
}
