package Java;

import java.util.Scanner;

public class Searching {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("what type of searching you want\n0.Linear search\n1.Binary search\n");
    int ch = sc.nextInt();
    switch (ch) {
      case 0:
        linearSearch();
        break;
      case 1:
        binarySearch();
        break;
      default:
        System.out.println("You enter wrong choice");
        break;
    }
  }

  static void linearSearch() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    int flag = 0;
    System.out.println("Enter the elememts of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search");
    int val = sc.nextInt();
    for (int j = 0; j < size; j++) {
      if (arr[j] == val) {
        System.out.printf("The element %d found in the index %d \n", arr[j], j);
        flag = 1;
      }
    }
    if (flag == 0)
      System.out.println("Element not found");
  }

  static void binarySearch() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    int flag = 0;
    System.out.println("Enter the elememts of array in ascending order");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search");
    int val = sc.nextInt();
    int high = size - 1;
    int low = 0;
    int mid;
    while (low < high) {
      mid = (high + low) / 2;
      if (arr[mid] == val) {
        System.out.printf("The element %d found in the index %d \n", arr[mid], mid);
        flag = 1;
        break;
      } else if (arr[mid] < val) {
        low = mid + 1;
      } else
        high = mid;
    }
    if (flag == 0)
      System.out.println("Element not found");
  }

}