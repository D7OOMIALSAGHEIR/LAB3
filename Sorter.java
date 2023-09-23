public class Sorter{
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
    

    

}