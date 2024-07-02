package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int prise) {
        int[] coins = {10, 5, 2, 1};
        int[] res = new int[100];
        int size = 0;
        int remaider = money - prise;
        for (int i = 0; i < coins.length; i++) {
            while (remaider >= coins[i]) {
                remaider -= coins[i];
                res[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(res, size);
    }
}