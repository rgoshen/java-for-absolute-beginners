package com.apress.bgn.ch9;

import java.util.Arrays;

import com.apress.bgn.ch9.algs.IntSorter;
import com.apress.bgn.ch9.algs.MergeSort;

public class SortingDemo {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 3 };

        IntSorter mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.print("Sorted: ");
        Arrays.stream(arr).forEach(i->System.out.print(i + " "));
    }
}