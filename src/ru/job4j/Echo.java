package ru.job4j;

public class Echo {
    public static void main(String[] args) {
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println("Вывод в консоль значения после преобразования: " + d);
    }
}
