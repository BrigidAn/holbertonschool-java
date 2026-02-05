package products;

public abstract class Products {
    protected String title;
    protected int year;
    protected String country;
    protected double grossPrice;

    public Products(String title, int year, String country, double grossPrice) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice = grossPrice;
    }

    public abstract double getNetPrice();

    // Getters
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public String getCountry() { return country; }
    public double getGrossPrice() { return grossPrice; }
}
