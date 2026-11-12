package Week10;

public class w10_25021779  {
    static class Result {
        int max;
        int min;
        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }
    public static Result maxMin(int[] A, int i, int j) {
        if (i == j) {
            return new Result(A[i], A[i]);
        }
        if (j == i + 1) {
            if (A[i] < A[j]) {
                return new Result(A[j], A[i]);
            } else {
                return new Result(A[i], A[j]);
            }
        }
        int diemChia = (i + j) / 2;
        Result left = maxMin(A, i, diemChia);
        Result right = maxMin(A, diemChia + 1, j);
        int maxVal = (left.max < right.max) ? right.max : left.max;
        int minVal = (left.min < right.min) ? left.min : right.min;
        return new Result(maxVal, minVal);
    }

    public static void main(String[] args) {
        int[] A = {3, 15, 67, 28, 50, 45, 69, 32, 93, 71};
        Result res = maxMin(A, 0, A.length - 1);
        System.out.println("Max: " + res.max);
        System.out.println("Min: " + res.min);
    }
}