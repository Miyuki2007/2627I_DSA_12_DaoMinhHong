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
        int count = 1;
        for (int i = 1; i < n; i++){
            if (a[i] == a[i-1]){
                count++;
            }
            else{
                result += count*(count-1)/2;
                count = 1;
            }
        }
        result += count*(count-1)/2;
        System.out.println(result);
    }
}
