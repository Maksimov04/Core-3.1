package task.io;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) {

    }

    // Реализуйте функциональность согласно описанию

    // TODO: Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
    //  строкой
    public static class WriteToFile {
        public static void main(String[] args) {
            String data = "HELLO";
            String fileName = "output.txt";

            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write(data);
                writer.close();
                System.out.println("Данные были успешно записаны в файл: " + fileName);
            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи данных в файл.");
                e.printStackTrace();
            }
        }
    }

    // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
    //  введенного текста создается файл

    public static class Console  {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("HELLO");
                String text = scanner.nextLine();

                System.out.println("C:\\Users\\Илья\\Desktop");
                String filePath = scanner.nextLine();

                if (!filePath.endsWith(".java")) {
                    filePath += ".java";
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(text);
                } catch (IOException e) {
                    System.err.println("Ошибка при записи в файл: " + e.getMessage());
                }
                System.out.println("Текст успешно сохранен в файле по указанному пути: " + filePath);
            } catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }

    // TODO: Создайте метод, который делит два числа и возвращает результат. Обработайте исключение,
    //  если второе число равно нулю , перехватите его(ArithmeticException) и выведите свое сообщение об ошибке с текстом
    //  "Деление на ноль запрещено"
    public static class Division {
        public static void main(String[] args) {
            int a = 10;
            int b = 4;
            try {
                int result = divide(a, b);
                System.out.println("Результат деления: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль запрещено.");
            }
        }
        public static int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль запрещено");
            } else {
                return a / b;
            }
        }
    }

    // TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Выбросите
    //  исключение, если введено не число
    public static class Square {
        public static void main(String[] args) {
            int a = 6;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(a);
                int number = scanner.nextInt();
                int square = number * number;
                System.out.println("Квадрат числа: " + square);
            } catch (InputMismatchException e) {
                System.err.println("Ошибка: Введено не число");
            }
        }
    }


    // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
    //  счета. Выбросите исключение, если на счете недостаточно средств.
    public static class BankAccount {
        private double balance;
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Недостаточно средств на счете");
            } else {
                balance -= amount;
                System.out.println("Сумма " + amount + " успешно снята со счета");
            }
        }

        public double getBalance() {
            return balance;
        }
        public static void main(String[] args) {
            BankAccount account = new BankAccount(500.0);
            try {
                account.withdraw(50.0);
                account.withdraw(70.0); // Попытка снять больше, чем есть на счете
            } catch (InsufficientFundsException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
    //  исключение, если файл не найден.

    public static  class FileData {
        public static void main(String[] args) {
            String fileName = "rer.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
            }
        }
    }

    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.

    public static class StringAge {
        public static void main(String[] args) {
            String str = "23";
            try {
                int number = convertToNumber(str);
                System.out.println("Число: " + number);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка: Невозможно преобразовать строку в число");
            }
        }

        public static int convertToNumber(String str) throws NumberFormatException {
            return Integer.parseInt(str);
        }
    }

    // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
    //  студента в список. Выбросите исключение, если список уже содержит студента с таким же именем.

    // TODO:Напишите программу который принимает с консоли два значения делит одно на другое и обрабатывает исключение, если введены некорректные данные:
    //  к примеру с консоли передали строки , а строки делить друг на друга нельзя , тогда выбросите ошибку и напишите сообщение об этом в консоль

    // TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
    //  Выбросить исключение, если двигатель уже запущен.

    // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
    //  считывает первое слово из файла
    public static class File {
        public static void main(String[] args) {
            try {
                String text = "Hello my name is Ilya";

                // Создание файла и запись текста в него
                String fileName = "rer.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                    writer.write(text);
                } catch (IOException e) {
                    System.err.println("Ошибка при записи в файл: " + e.getMessage());
                }
                System.out.println("Текст успешно записан в файл: " + fileName);

                // Считывание первого слова из файла
                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line = reader.readLine();
                    if (line != null) {
                        String[] words = line.split("\\s+");
                        if (words.length > 0) {
                            System.out.println("Первое слово из файла: " + words[0]);
                        } else {
                            System.out.println("Файл пустой.");
                        }
                    } else {
                        System.out.println("Файл пустой.");
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка при чтении файла: " + e.getMessage());
                }
            } catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}