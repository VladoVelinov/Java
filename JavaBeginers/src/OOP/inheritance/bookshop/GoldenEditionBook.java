package OOP.inheritance.bookshop;


public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String author, String title, double price) throws IllegalArgumentException {
        super(author, title, price);
    }

    @Override
    public void setPrice(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid");
        }
        this.price = price * 1.3;
    }

    @Override
    public String toString() {
        return "Golden Edition!!: " + super.toString();
    }
}