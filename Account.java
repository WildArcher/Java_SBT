package task_1;

public class Account {
    private final long id;
    private double balance;

    public Account(long id) {
        this.id = id;

    }

    public boolean withdraw(double amount) {
        if((amount > 0) && (balance - amount > 0)){
            balance -= amount;
            return true;
        }
        return false;

    }

    public boolean add(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
}
