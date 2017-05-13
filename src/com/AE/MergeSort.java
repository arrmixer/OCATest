package com.AE;

/**
 * Created by Angel on 4/30/17.
 */
public class MergeSort {

    public static void mergeSort(int a[]){
        mergeSort(a, 0, a.length - 1);
    }

    public static void mergeSort(int[] a, int p, int r){
       if (r <= p ){
         return ;
       }
        int q = (p + r)/2;
        mergeSort(a, p, q);// sort left half
        mergeSort(a, q + 1, r); // sort right half
        merge(a, p, q, r); // merge sorted results into the a



    }



    public static void merge(int[] a, int p, int q, int r){
        int left_cnt = q - p + 1;
        int right_cnt = r - q;
        int k = 0;

        int[] L  =new int[q - p + 1];
        int[] R = new int[r - q];

        for(int i =0;i<L.length + 1;i++){
            L[i] = a[p + i - 1];
        }

        for(int j = 0;j<R.length + 1;j++){
            R[j] = a[q + j];
        }

        L[left_cnt + 1] = 999999999;
        R[right_cnt + 1] = 999999999;

        int i = 0;
        int j = 0;

        for(k = p;k<q;k++){
            if(L[i] > R[j]){

                a[k] = L[i];
                i = j + 1;
            }else{
                a[k] = R[j];
                j = j + 1;
            }

        }

    }

    public static void main(String[] args) {
        int a[] = {9,8,99,110,8,87,637,8,3,13,87,12,99};
        mergeSort(a);
    }


}
