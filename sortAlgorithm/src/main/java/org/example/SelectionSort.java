package org.example;

public class SelectionSort {
    public void sort1(int[] arr){
        // set giá trị đầu của dãy là min
        int min = arr[0];
        for (int i=0; i<arr.length -1 ; i++){
            for (int j=i+1; j< arr.length; j++){
                // so sánh giá trị thứ i và thứ j=i+1
                // nếu a[j] nhỏ hơn thì đổi chỗ với a[i]
                if (arr[j]<arr[i]){
                    min = arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                }
            }
        }
    }
    public static void main(String[]args){
        int[] arr = {7, 9,3,1,5,2};
        SelectionSort ss = new SelectionSort();
        ss.sort1(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
