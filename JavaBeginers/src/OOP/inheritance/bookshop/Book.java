package OOP.inheritance.bookshop;

public class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String author, String title, double price) throws IllegalArgumentException {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title.length() < 4)
            throw new IllegalArgumentException("Title not valid!");

        this.title = title;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        String[] names = author.split(" ");
        if (names.length > 1) {
            if (Character.isDigit(names[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid");
            }
        }
        this.author = author;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid");
        }
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "author: " + author + " title: " + title + " price: " + price;

    }
}