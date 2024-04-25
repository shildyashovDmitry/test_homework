package edu.java.development;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        sayHello();
        System.out.println("Конец программы");
    }
    public static void sayHello(){
        printHeader();
        System.out.println("Привет");
    }
    public static void printHeader(){
        System.out.println("Сейчвс будет приветствие...");
    }


}
/*public class Practicum {
    public static void main(String[] args) {
        System.out.println("Начало программы");
        sayHello(); // Вызывов метода sayHello
        System.out.println("Конец программы");
    }

    public static void sayHello() { //объявление метода sayHello
        printHeader(); // Вызывов метода printHeader
        System.out.println("Привет!");
    }

    public static void printHeader() {
        System.out.println("Сейчвс будет приветствие...");
    }
}*/