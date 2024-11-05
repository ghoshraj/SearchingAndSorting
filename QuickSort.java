package searchingAndSorting;

import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int arr[] , int start , int end){
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int pivot = arr[(i + j)/2];
        while (i <= j){
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quicksort(arr , start , j);
        quicksort(arr , i , end);
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
        quicksort(arr , 0 , arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
