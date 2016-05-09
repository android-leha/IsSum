package ru.zapiataia.telran.isSumm;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = {1, 4, 5, 4, 5};
        int sum = 3;
        boolean res = isSumPresent(array, sum);
        System.out.println("" + sum + " is " + (res ? "" : "NOT ") + "present in " + Arrays.toString(array));
    }

    /**
     * Looking for two elements in result
     *
     * @param array assumed array
     * @param sum the required amount
     * @return result
     */
    static boolean isSumPresent(int[] array, int sum) {
        if (sum < 2) {
            return false;
        }
        int size = (int) Math.floor(sum / 2);
        int tmp[] = new int[size];
        for (int value : array) {
            if (value > 0 && value < sum) {
                int index = (value > size) ? sum - value : value;
                if (tmp[index - 1] != value) {
                    tmp[index - 1] += value;
                }
                // Just for easy debug
                System.out.println(Arrays.toString(tmp) + " {" + value + ", " + index + ", " + sum + "}");
                if (tmp[index - 1] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
