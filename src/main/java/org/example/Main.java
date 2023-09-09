package org.example;

import java.util.*;

// Создаем собственное исключение
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Класс, который использует собственное исключение
class Example {
    // Метод, который может выбросить собственное исключение
    public static void doSomething(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Значение должно быть больше или равно нулю");
        }
    }

    public static void main(String[] args) {
        try {
            // Вызываем метод, который может выбросить исключение
            doSomething(5);
        } catch (CustomException e) {
            // Обрабатываем исключение
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}