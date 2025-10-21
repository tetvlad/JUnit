package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayProcessorTest {
    /*В классе создайте методы вида:

        @org.junit.jupiter.api.Test
        public void testConcat_validArgument_success() {
        //В классе создайте методы вида
        // given:
            ...
        // when:
            ...
        // then:
        //Assertions.***;
        }
        где на месте ... размещаете код подготовки к тестированию,
        а затем вызова целевого метода
        а набрав Assertions. выберите подходящий метод из подсказок IntelliJ IDEA.
        Таких методов (ассертов) можете сделать несколько в одном тестирующем методе
     */

    private ArrayProcessor processor;

    @BeforeEach
    public void setUp() {

        processor = new ArrayProcessor();
    }

    @Test
    public void processArray_withOddLength_shouldReturnSameArray() {
        // given: создал массив с нечетной длиной
        int[] inputArray = {10, 20, 30, 40, 50};
        int[] expectedArray = {10, 20, 30, 40, 50};

        // when: вызываем тестируемый метод
        int[] resultArray = processor.processArray(inputArray);

        // then: итог

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void processArray_withEvenLength_shouldReturnReversedArray() {
        // given: массив с четной длиной
        int[] inputArray = {1, 2, 3, 4};
        int[] expectedArray = {4, 3, 2, 1};

        // when: вызываем метод
        int[] resultArray = processor.processArray(inputArray);

        // then: итог
        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void processArray_withEmptyArray_shouldReturnEmptyArray() {
        // given: пустой массив
        int[] inputArray = {};
        int[] expectedArray = {};

        // when: вызываем метод
        int[] resultArray = processor.processArray(inputArray);

        // then: итог
        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void processArray_withNullInput_shouldReturnEmptyArray() {
        // given: null вместо массива
        int[] inputArray = null;
        int[] expectedArray = {};

        // when:
        int[] resultArray = processor.processArray(inputArray);

        // then:
        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

}
