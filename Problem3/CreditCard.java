package Problem3;

public class CreditCard { // CreditCard class

    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) { // Constructor for CreditCard
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0, 0);
    }

    // Accessor - balance
    public Money getBalance() {
        return new Money(balance);
    }

    // Accessor - credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Accessor - owner details
    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance.add(amount);
        } else {
            System.out.println("Error: Charge exceeds credit limit");
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance.subtract(amount);
    }

}
