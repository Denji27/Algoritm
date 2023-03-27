package org.example;

public class InsertionSort {
    public void sort( int[] arr){
        int n= arr.length;
        int last, j, i;
        for (i=1; i<n; i++) {
            last = arr[i];
            j = i;
            // chuyển các phần tử lớn hơn last về phía sau vị trí của dãy
            while ((j > 0) && (arr[j - 1] > last)) {
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = last;
        }
    }

    public static void main(String[] args){
        int[] arr={3, 44, 38, 5, 47, 15, 36};
        System.out.println("day so truoc khi sap xep");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        InsertionSort is = new InsertionSort();
        is.sort(arr);

        System.out.println("day so sau khi duoc sap xep la");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
