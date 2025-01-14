package Lecture10Array2SearchingSorting;

public class MergeTwoSortedArrayCodeHMFive14 {
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int i = 0,j = 0,k= 0;
        int arr3[] = new int [arr1.length+arr2.length];
        while(i<arr1.length && j < arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }

            while(i<arr1.length){
                arr3[k] = arr1[i];
                k++;
                i++;
            }

            while(j<arr2.length){
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        
        return arr3;
    }
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1 ,3 ,4 ,7 ,11};
		int arr2[] = {2 ,4 ,6 ,13};
		int[] arr3 = merge(arr1,arr2);
		
//		System.out.print(arr3);
		printArray(arr3);
	}

}
