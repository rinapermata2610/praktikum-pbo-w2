package Soal5Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("     PROGRAM DATA GOODS (INTERAKTIF) ");
        System.out.println("=====================================");

        // === INPUT FOOD ===
        System.out.println("\n>> Input Data Food <<");
        System.out.print("Nama Makanan      : ");
        String foodName = input.nextLine();
        System.out.print("Harga Makanan     : ");
        double foodPrice = input.nextDouble();
        System.out.print("Jumlah Kalori     : ");
        int calories = input.nextInt();
        input.nextLine(); // buang newline

        Food food = new Food(foodName, foodPrice, calories);

        // === INPUT TOY ===
        System.out.println("\n>> Input Data Toy <<");
        System.out.print("Nama Mainan       : ");
        String toyName = input.nextLine();
        System.out.print("Harga Mainan      : ");
        double toyPrice = input.nextDouble();
        System.out.print("Minimum Usia      : ");
        int minAge = input.nextInt();
        input.nextLine();

        Toy toy = new Toy(toyName, toyPrice, minAge);

        // === INPUT BOOK ===
        System.out.println("\n>> Input Data Book <<");
        System.out.print("Judul Buku        : ");
        String bookName = input.nextLine();
        System.out.print("Harga Buku        : ");
        double bookPrice = input.nextDouble();
        input.nextLine();
        System.out.print("Nama Penulis      : ");
        String author = input.nextLine();

        Book book = new Book(bookName, bookPrice, author);

        // === DISPLAY HASIL ===
        System.out.println("\n=====================================");
        System.out.println("            HASIL INPUT DATA         ");
        System.out.println("=====================================");

        System.out.println("\n=== DATA FOOD ===");
        System.out.printf("Description : %s\n", food.getDescription());
        System.out.printf("Price       : $%.2f\n", food.getPrice());
        System.out.printf("Calories    : %d\n", food.getCalories());

        System.out.println("\n=== DATA TOY ===");
        System.out.printf("Description : %s\n", toy.getDescription());
        System.out.printf("Price       : $%.2f\n", toy.getPrice());
        System.out.printf("Minimum Age : %d\n", toy.getMinimumAge());
        System.out.printf("Tax         : $%.2f\n", toy.calculateTax());

        System.out.println("\n=== DATA BOOK ===");
        System.out.printf("Description : %s\n", book.getDescription());
        System.out.printf("Price       : $%.2f\n", book.getPrice());
        System.out.printf("Author      : %s\n", book.getAuthor());
        System.out.printf("Tax         : $%.2f\n", book.calculateTax());

        System.out.println("\n=====================================");
        System.out.println("         TERIMA KASIH :)             ");
        System.out.println("=====================================");

        input.close();
    }
}
