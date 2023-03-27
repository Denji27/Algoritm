package org.example;

public class QuickSort {
        public static void main(String[] args) {
            int[] x = {6, 2, 3, 4, 5, 9, 1};
            printArray(x);

            int left = 0;
            int right = x.length - 1;
            System.out.println(right);
            quickSort(x, left, right);
            printArray(x);
        }

        public static void quickSort(int[] arr, int left, int right) {
            if (arr == null || arr.length == 0)
                return;

            if (left >= right)
                return;
            // giá trị chốt có số thứ tự là middle
            int middle = left + (right - left) / 2;
            int pivot = arr[middle];
            int i = left, j = right;

            //phân chia dãy ra bởi giá trị chốt
            // bên trái là các giá trị bé hơn giá trị chốt
            // bên phải là các giá trị lớn hơn giá trị chốt
            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }

                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            // sắp xếp nửa bên trái
            if (left < j)
                quickSort(arr, left, j);

            // sắp xếp nửa bên phải
            if (right > i)
                quickSort(arr, i, right);
        }

        public static void printArray(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

