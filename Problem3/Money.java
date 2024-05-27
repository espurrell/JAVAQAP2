package Problem3;

public class Money {

    private int dollars;
    private int cents;

    // Constructor
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getter methods
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // compareTo method
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        }
        return this.cents - other.cents;
    }

    // Add money
    public void add(Money amount) {
        this.cents += amount.cents;
        this.dollars += amount.dollars + this.cents / 100;
        this.cents %= 100;
    }

    // Subtract money
    public void subtract(Money amount) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = amount.dollars * 100 + amount.cents;
        int diffCents = totalCents1 - totalCents2;
        this.dollars = diffCents / 100;
        this.cents = diffCents % 100;
    }

}
