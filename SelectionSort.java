//package Logic;

public class SelectionSort {

	//static int length;
	public static void sortArray(int[] array)
    {
        int temporary;
 
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                	
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
            System.out.println(array[i]);
        }
        
        //sortArray(array);
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -5, -9, 8, 12, 1, 3 };
		//length = array.length;
		sortArray(array);
		
	}

}
