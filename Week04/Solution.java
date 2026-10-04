package Week04;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    private static void printArray(List<Integer> a){
        for (int num : a){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void insertionSort1(int n, List<Integer> a) {
        for (int i = 1; i < n; i++){
            int j = i - 1;
            boolean ktr = false;
            int tam = a.get(i);
            while (j >= 0 && !ktr){
                if (a.get(j) > tam){
                    a.set(j+1,a.get(j));
                    j--;
                }
                else{
                    ktr = true;
                }
            }
            a.set(j+1,tam);
            printArray(a);
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
