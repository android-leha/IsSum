package ru.zapiataia.telran.isSumm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class MainTest {

    private int[] array;

    private int sum;
    private boolean result;


    public MainTest(int[] array, int sum, boolean result) {
        this.array = array;
        this.sum = sum;
        this.result = result;
    }


    @Parameters
    public static Collection<Object[]> data() {
        int[][] arrays = {
                {40, 4, 1, 8, 9, 2, 3, 7, 12, 20},
                {124, 32, 63, 17},
                {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 3},
                {0, 16, 32, 48, 64, 80, 96, 112, 128, 142, 158, 174, 190, 206, 222, 238, 256, 512, 1024}
        };
        Object[][] data = new Object[][] {
                {arrays[0], 5, true},
                {arrays[0], 7, true},
                {arrays[0], 26, false},
                {arrays[0], 17, true},
                {arrays[0], 25, false},
                {arrays[0], 10, true},
                {arrays[0], 27, true},
                {arrays[0], 60, true},
                {arrays[0], 250, false},

                {arrays[1], 321, false},

                {arrays[2], 5, true},
                {arrays[2], 7, true},
                {arrays[2], 8, true},
                {arrays[2], 9, false},

                {arrays[3], 48, true},
                {arrays[3], 15, false},
        };
        return Arrays.asList(data);
    }

    @Test
    public void isSumPresent() throws Exception {
        assertEquals(result, Main.isSumPresent(array, sum));
    }

}