package searchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int ele = sc.nextInt();
        int start = 0;
        int end = arr.length;
        int mid = 0;
        int count = 0;
        while (start < end){
            mid = (start + end)/2;
            if (arr[mid] == ele){
                count++;
                break;
            }
            else if (ele > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if (count > 0)
            System.out.println("Element found at index : " + mid);
        else
            System.out.println("Element not found : ");
    }
}
