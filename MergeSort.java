package searchingAndSorting;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[] , int start , int mid ,int end){
        int l = mid - start + 1;
        int r = end - mid;
        int l_s[] = new int[l];
        int r_s[] = new int[r];
        for (int i = 0 ; i < l; i++){
            l_s[i] = arr[start + i];
        }
        for (int i = 0 ; i < r; i++){
            r_s[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0 , k = start;
        while (i < l && j < r){
            if (l_s[i] <= r_s[j]){
                arr[k] = l_s[i];
                i++;
                k++;
            }
            else {
                arr[k] = r_s[j];
                j++;
                k++;
            }
        }
        while (i < l){
            arr[k] = l_s[i];
            i++;
            k++;
        }
        while (j < r){
            arr[k] = r_s[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int arr[],int start , int end){
        if (start < end){
            int mid = (start + end) / 2;
            mergesort(arr , start , mid);
            mergesort(arr , mid + 1 , end);
            merge(arr , start , mid , end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Result ");
        mergesort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
