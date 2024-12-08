package Lecture15Recursion2;

import java.util.Iterator;

public class MergeSortProblemHMThree7 {
	
	public static void merge(int[] A, int[] L, int leftCount, int[] R, int rightCount) {
        int i, j, k;
        i = 0; j = 0; k = 0;

        // Merge two arrays until we run out of elements in one of them
        while (i < leftCount && j < rightCount) {
            if (L[i] < R[j]) {
                A[k++] = L[i++];
            }
            else {
                A[k++] = R[j++];
            }
        }

        // Add any remaining elements from the left array
        while (i < leftCount) {
            A[k++] = L[i++];
        }

        // Add any remaining elements from the right array
        while (j < rightCount) {
            A[k++] = R[j++];
        }
    }

    // Recursive function to sort an array of integers using merge sort
    public static void mergeSort(int[] A) {
        int n = A.length;
        if (n <= 1) {
            return;  // base case: if the array has less than two elements, do nothing
        }

        int mid = n / 2;  // find the mid index

        // Create left and right subarrays
        // mid elements (from index 0 to mid-1) should be part of left sub-array
        // and (n-mid) elements (from mid to n-1) should be part of right sub-array
        int[] L = new int[mid];
        int[] R = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            L[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            R[i - mid] = A[i];
        }

        // Recursively sort the left and right subarrays
        mergeSort(L);
        mergeSort(R);

        // Merge the sorted left and right subarrays
        merge(A, L, mid, R, n - mid);
    }

    // Test function
    public static void main(String[] args) {
        int[] A = {5, 2, 8, 1, 9, 4, 3, 7};

        // Print the unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Call the merge sort function
        mergeSort(A);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
			
		}
		 
		 
		 
	
}