package task_1;

public class Customer {
    private final String name;
    private final String lastName;
    private Account account;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public boolean openAccount(long accountId) {
        if(account == null){
            account = new Account(accountId);
            return true;
        }
        else{
            System.out.println("Customer " + fullName() + " already has the active account");
            return false;
        }
    }

    public boolean closeAccount() {
        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account to close");
            return false;
        }
        else{
            account = null;
            return false;
        }
    }

    public String fullName() {
        return name + " " + lastName;
    }

    public boolean withdrawFromCurrentAccount(double amount) {
        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account");
            return false;
        }
        return account.withdraw(amount);
    }

    public boolean addMoneyToCurrentAccount(double amount) {
        // write your code here
        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account");
            return false;
        }
        return account.add(amount);
    }
}

