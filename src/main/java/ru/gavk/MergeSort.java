package ru.gavk;

public class MergeSort {
    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, p + 1, r);
            merge(a, p, q, r);
        }
    }

    public static void merge(int[] a, int p, int q, int r) {
        if (r - p < 2)
            return;

        int[] buff = new int[r - p];
        int indexFirst = p;
        int indexSecond = q;
        int indexBuff = 0;

        sort(a, p, q);
        sort(a, q+1, r);

        while (indexFirst < q && indexSecond < r) {
            if (a[indexFirst] <= a[indexSecond]) {
                buff[indexBuff] = a[indexFirst];
                indexBuff++;
                indexFirst++;
            } else {
                buff[indexBuff] = a[indexSecond];
                indexBuff++;
                indexSecond++;
            }
        }
        while (indexFirst < q) {
            buff[indexBuff] = a[indexFirst];
            indexBuff++;
            indexFirst++;
        }
        while (indexSecond < r) {
            buff[indexBuff] = a[indexSecond];
            indexBuff++;
            indexSecond++;
        }

        System.arraycopy(buff, 0, a, p, r - p);
    }

}
