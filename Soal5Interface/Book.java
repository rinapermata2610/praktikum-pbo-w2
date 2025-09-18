package Soal5Interface;

public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
        System.out.println("Tax: $" + calculateTax());
    }
}
