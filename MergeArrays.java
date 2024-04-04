public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - 1;
        for (int j = m - 1; j >= 0; j--) {
            if (X[j] != 0) {
                X[i] = X[j];
                i--;
            }
        }
        i = n;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }
        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
