package searchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 1 ; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Result ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
