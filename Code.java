package MergeSort;

import java.util.Arrays;

class mergSort {

    public mergSort() {

    }

    public int[] mergeArray(int[] a1, int[] a2) {
        // Tron mang
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // a1 & a2 deu co phan tu
                if (a1[i1] <= a2[i2]) { // a1 < a2
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a1 > a2
                    result[i] = a2[i2];
                    i++;
                    i2++;

                }
            } else { // a1 & a2 deu rong
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;

                }

            }
        }
        return result;
    }
    public int[] mergeSort(int a[], int Left , int Right){
        if (Left > Right)   // Dieu kien du T.hop Special
            return new int[0];
        if ( Left == Right) {   //Dieu kien du T.hop Special
            int[] singleE = {a[Left]};
            return singleE;
        }

        // Chia nho
        int k = (Left+Right)/2;
        int a1[]= mergeSort(a, Left , k);
        int a2[]= mergeSort(a, k+1 , Right);

        // tron
        int[] result = mergeArray(a1, a2);
        return result;

    }
    public int[] sortArray(int[] numbers){
        return mergeSort(numbers, 0 , numbers.length-1);
    }
    public static void main(String[] args){
        mergSort S = new mergSort();
        int[] c ={6,2,5,8,9,0,1,3,7};
        System.out.println(Arrays.toString(S.mergeSort(c,0, c.length-1)));

    }

}
