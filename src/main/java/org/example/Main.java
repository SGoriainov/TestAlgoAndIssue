package org.example;

import java.util.*;

// Создаем собственное исключение
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Класс, который использует собственное исключение
class EmailValidator {
    // Метод, который может выбросить собственное исключение
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Некорректный адрес электронной почты");
        }
    }

    public static void main(String[] args) {
        try {
            // Вызываем метод, который может выбросить исключение
            validateEmail("example.com");
        } catch (InvalidEmailException e) {
            // Обрабатываем исключение
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}