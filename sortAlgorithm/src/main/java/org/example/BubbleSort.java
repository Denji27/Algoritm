package org.example;

public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i=0; i<n-1; i++){
                if(arr[i]> arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void main(String[] args){
        int[] arr= {44, 13,46, 13, 16, 37,32, 35, 25, 50};
        int[] arr1= {3, 44, 38,5, 47,15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("day so truoc khi sap xep");
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.println("day so sau khi sap xep");
        BubbleSort bb = new BubbleSort();
        bb.sort(arr1);
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
