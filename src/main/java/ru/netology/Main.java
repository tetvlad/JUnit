package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Эта часть отвечает только за ввод-вывод
        Scanner console = new Scanner(System.in);

        if (console.hasNextInt()) {
            int n = console.nextInt();
            if (n > 0) {
                int[] inputArray = new int[n];
                for (int i = 0; i < n; i++) {
                    inputArray[i] = console.nextInt();
                }

                // Создаем экземпляр нашего обработчика
                ArrayProcessor processor = new ArrayProcessor();

                // Вызываем чистый, тестируемый метод
                int[] resultArray = processor.processArray(inputArray);

                // Результат
                for (int value : resultArray) {
                    System.out.println(value);
                }
            } else if (n == 0) {
                // Обрабатываем случай с N=0
                System.out.println(""); // Ничего не выводим
            }
        }
    }
}