package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOfSet(data, min, 0, data.length - 1);
            SwitchArray.swap(data, min, index);

        }
        return data;
    }
}
