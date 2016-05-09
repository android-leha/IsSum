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

    private int[] array = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 3};
//    private int[] array = {40, 4, 1, 8, 9, 2, 3, 7, 12, 20};
//    private int[] array = {124, 32, 63, 17}; Версия массива от Игоря Петицких

    private int sum;
    private boolean result;


    public MainTest(int sum, boolean result) {
        this.sum = sum;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
//                {5, true},
//                {7, true},
//                {26, false},
//                {17, true},
//                {25, false},
//                {10, true},
//                {27, true},
//                {60, true},
//                {250, false},
//                {321, false} // Данные от Игоря Петицких
//                {5, true},
                {7, true},
        };
        return Arrays.asList(data);
    }

    @Test
    public void isSumPresent() throws Exception {
        assertEquals(result, Main.isSumPresent(array, sum));
    }

}