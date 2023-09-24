public class Sorter{
    // implementation to sort numbers ascendingly using insertion sort
    public static void insertionSort(int[] array){
        for(int i = 1; i<array.length; i++){
            int temp = array[i];
            int j;
            for(j = i-1; j >= 0 && temp < array[j]; j = j-1){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }
    
    // the following method invokes "InsertionSort" method
    public static void callInsertionSort(int[] arr){
        insertionSort(arr);
    }
    // implementation of selection sort 
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
        }
        public static void callSelectionSort(int[] arr){
            selectionSort(arr);
        }
    }  


    

