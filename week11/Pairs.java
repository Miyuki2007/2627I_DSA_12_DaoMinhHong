package week11;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];
        Set<Long> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            set.add(arr[i]);
        }

        int count = 0;
        for (long num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

