package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[source] = array[dest];
        array[dest] = temp;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        
        //int[] result = swap(nums, 2, 4);
          //  for (int j = 0; j < ; j++) {
                
            //}
        }
    }
}
