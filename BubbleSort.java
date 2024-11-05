package searchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Result ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
