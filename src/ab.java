import java.util.*;

public class ab {
    public static void main(String[] args) {
        int[] a = {5, 2, 6, 4, 3, 2, 6, 1, 9};
        int p = 0;
        int q = a.length - 1;
        sort(a, p, q);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(A, p, q);
            sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;

        int[] B = new int[r - p + 1];
        int k = 0;

        while (i <= q && j <= r) {
            if (A[i] < A[j]) {
                B[k] = A[i];
                i++;
            } else {
                B[k] = A[j];
                j++;
            }
            k++;
        }
        while (i <= q) {
            B[k] = A[i];
            i++;
            k++;
        }

        while (j <= r) {
            B[k] = A[j];
            j++;
            k++;
        }
        for (k = 0; k < B.length; k++) {
            A[p + k] = B[k];
        }
    }

}
