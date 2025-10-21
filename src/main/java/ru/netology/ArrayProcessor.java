package ru.netology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProcessor {

    public int[] processArray(int[] numbers) {
        if (numbers == null) {
            return new int[0]; // Безопасная обработка null
        }

        if (numbers.length % 2 == 0) {
            // Если длина четная - переворачиваем
            int[] reversed = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                reversed[i] = numbers[numbers.length - 1 - i];
            }
            return reversed;
        } else {
            // Если длина нечетная - возвращаем как есть
            return numbers;
        }
    }
}
