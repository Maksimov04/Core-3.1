package task.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {

    }

    //Реализуйте функциональность согласно описанию

// TODO: Напишите метод, который принимает два числа от пользователя и использует функциональный интерфейс BinaryOperator
//  для сложения этих чисел и вывода результата. Используйте для решения лямбда выражение
public static class Calculator {

    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum;
        int num1 = 5;
        int num2 = 10;
        int result = add.apply(num1, num2);

        System.out.println("Результат сложения чисел: " + result);
    }
}
    // TODO: Напишите метод, который принимает список слов от пользователя и использует функциональный интерфейс Predicate
//  для фильтрации слов, начинающихся с определенной буквы, и вывода отфильтрованного списка.Используйте для решения лямбда выражение


    public static class ListStr {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
            char letter = 'a';
            Predicate<String> startsWithLetter = word -> word.startsWith(String.valueOf(letter));
            List<String> filteredWords = words.stream().filter(startsWithLetter).toList();

            System.out.println("Слова, начинающиеся с буквы '" + letter + "':");
            filteredWords.forEach(System.out::println);
        }
    }

// TODO: Напишите метод, который принимает список чисел от пользователя и использует функциональный интерфейс Function
//  для преобразования каждого числа в его квадрат и вывода списка квадратов.Используйте для решения лямбда выражение


    public static class Square {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            Function<Integer, Integer> squareFunction = num -> num * num;
            List<Integer> squares = numbers.stream().map(squareFunction).toList();

            System.out.println("Список квадратов чисел: " + squares);
        }
    }

    // TODO: Напишите метод, который принимает список строк от пользователя и использует функциональный интерфейс Consumer
//  для вывода каждой строки в верхнем регистре.Используйте для решения лямбда выражение
    public static class ConsumerList {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("Hello", "me", "name", "!");
            Consumer<String> stringConsumer = s -> System.out.println(s.toUpperCase());
            strings.forEach(stringConsumer);
        }
    }


    // TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
//  входных данных и вычисляет их сумму с использованием стримов.
    public static class SumList {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Сумма всех чисел в списке: " + sum);
        }
    }

// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.

    public static class ArithmeticMean {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

            System.out.println("Среднее значение: " + average);
        }
    }


    // TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наибольшее число с использованием стримов.
    public static class AgeList {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 25, 6, 11, 15);
            Integer maxNumber = numbers.stream().max(Integer::compare).get();
            System.out.println("Наибольшее число в списке: " + maxNumber);
        }
    }


    // TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наименьшее число с использованием стримов.
    public static class MinAge {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 25, 6, 11, 15);
            Integer minNumber = numbers.stream().min(Integer::compare).get();
            System.out.println("Наименьшее число в списке: " + minNumber);
        }
    }


    // TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
//  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
//  стримов.
    public static class ListOfDefinedValue {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            int targetValue = 3;

            boolean containsValue = numbers.stream().anyMatch(num -> num == targetValue);

            if(containsValue) {
                System.out.println("Список содержит значение " + targetValue);
            } else {
                System.out.println("Список не содержит значение " + targetValue);
            }
        }
    }

    // TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
//  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.
    public static class DeleteList {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6);
            List<Integer> distinctNumbers = numbers.stream().distinct().toList();
            System.out.println("Исходный список: " + numbers);
            System.out.println("Список без дубликатов: " + distinctNumbers);
        }
    }


// TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и преобразует его в список их длин с использованием стримов.

    public static class ListString {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "cherry", "dates");
            List<Integer> stringLengths = strings.stream().map(String::length).toList();

            System.out.println("Длины строк: " + stringLengths);
        }
    }


// TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и соединяет их все в одну строку с использованием стримов.

    public static class ListOneString {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "cherry", "dates");
            String result = String.join("", strings);

            System.out.println("Объединенная строка: " + result);
        }
    }


// TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая принимает список
//  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.

    public static class EvenNumbers {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();

            System.out.println("Четные числа: " + evenNumbers);
        }
    }
}