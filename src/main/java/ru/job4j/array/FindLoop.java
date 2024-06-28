package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        if (start > finish || data.length < start || data.length < finish || data.length == 0) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (i >= start && i <= finish) {
                if (data[i] == element) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        System.out.println(indexInRange(array, 4, 1, 8));
    }
}