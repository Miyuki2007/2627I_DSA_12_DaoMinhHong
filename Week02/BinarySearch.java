package Week02;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = -1;
        int l = 1, r = n;
        while (l <= r){
            int m = l + (r - l)/2;
            if (k < a[m]){
                r = m - 1;
            }
            else if (k > a[m]){
                l = m + 1;
            }
            else{
                result = m;
                r = m - 1;
            }
        }
        if (result != -1)
        {
            System.out.println("Tìm thấy đầu tiên tại chỉ số: " + result);
        }
        else{
            System.out.println("Không tìm thấy giá trị trong mảng.");
        }
        sc.close();
    }
}
