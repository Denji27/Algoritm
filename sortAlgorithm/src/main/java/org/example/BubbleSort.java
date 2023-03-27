package org.example;

public class BubbleSort {
    public void sort(int[] arr) {
        // n là chiều dài của dãy số cho trước
        int n = arr.length;
        boolean swapped;
        // Vòng lặp do có điều kiện dừng là while (swapped)
        do {
            swapped = false;
            // xét từ giá trị đầu đến giá trị cuối của dãy
            for (int i=0; i<n-1; i++){
                // Nếu giá trị được xét lớn hơn giá trị ngay sau nó thì đổi chỗ hai giá trị và set gia tri swapped = true
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
