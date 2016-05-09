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
        int tmp[] = new int[sum];
        for (int index : array) {
            int revIndex = sum - index;
            if (index > 0 && index < sum) {
                tmp[index] += index;
                if (index != revIndex) {
                    tmp[revIndex] += index;
                }
                // Just for easy debug
//                System.out.println(Arrays.toString(tmp) + " {" + index + ", " + revIndex + ", " + sum + "}");
                if (tmp[index] == sum || tmp[revIndex] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
