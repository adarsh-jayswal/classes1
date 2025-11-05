package Recursion;

public class MaxInArray {

    static int findMax(int arr[], int index, int currentMax) {
        if (index == arr.length) {
            return currentMax;
        }
        if (arr[index] > currentMax) {
            currentMax = arr[index];
        }
        return findMax(arr, index + 1, currentMax);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 3};
        int max = findMax(arr, 0, arr[0]);
        System.out.println(max);
    }
}

