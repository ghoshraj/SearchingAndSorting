package searchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
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
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ele){
                count++;
               ele = i;
                break;
            }
        }
        if (count > 0)
            System.out.println("Element found at index : " + ele);
        else
            System.out.println("Element not found : ");
    }
}
