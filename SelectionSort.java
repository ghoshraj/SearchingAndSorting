package searchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1 ; i++){
            int loc = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[loc])
                    loc = j;
            }
            int temp = arr[i];
            arr[i] = arr[loc];
            arr[loc] = temp;
        }
        System.out.println("Result ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
