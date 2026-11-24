package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers {
    public static List<Integer> missingNumbersHash(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : brr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            freq.put(num, freq.get(num) - 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
    public static List<Integer> missingNumbersSort(List<Integer> arr, List<Integer> brr) {
        List<Integer> sortedA = new ArrayList<>(arr);
        List<Integer> sortedB = new ArrayList<>(brr);

        Collections.sort(sortedA);
        Collections.sort(sortedB);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = sortedA.size(), m = sortedB.size();

        while (j < m) {
            if (i < n && sortedA.get(i).equals(sortedB.get(j))) {
                i++;
                j++;
            } else {
                int missingVal = sortedB.get(j);
                if (result.isEmpty() || result.get(result.size() - 1) != missingVal) {
                    result.add(missingVal);
                }
                j++;
            }
        }
        return result;
    }
    public static List<Integer> missingNumbersCountingSort(List<Integer> arr, List<Integer> brr) {
        int minVal = Integer.MAX_VALUE;
        for (int num : brr) {
            if (num < minVal) {
                minVal = num;
            }
        }

        int[] count = new int[101];

        for (int num : brr) {
            count[num - minVal]++;
        }

        for (int num : arr) {
            count[num - minVal]--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                result.add(i + minVal);
            }
        }

        return result;
    }
    private static void printResult(String label, List<Integer> list) {
        System.out.print(label + ":");
        for (int x : list) System.out.print(" " + x);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> brr = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            brr.add(sc.nextInt());
        }
        printResult("Cach 1 (Hash Table)", missingNumbersHash(arr, brr));  //O(n + m)
        printResult("Cach 2 (Sorting)   ", missingNumbersSort(arr, brr));  //O(nlogn + mlogm)
        printResult("Cach 3 (Counting)  ", missingNumbersCountingSort(arr, brr));  //O(n + m)
    }
}
