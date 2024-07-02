package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static int[] getIndexV2(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}