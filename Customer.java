//import static org.junit.jupiter.api.Assertions.assertThrows;
//import org.junit.jupiter.api.Test;

public class Customer {
    private final String name;
    private final String lastName;
    private Account account;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static class Test{

        public void test_1()
        {
            // test 1 - open 2 accounts
            Customer customer1 = new Customer("Ivan", "Ivanov");
            customer1.openAccount(123456L);
            if (!customer1.openAccount(123456L)) System.out.println("Successful test 1");
        }

        public void test_2()
        {
            // test 2 - add - 100
            Customer customer2 = new Customer("Ivan", "Ivanov");
            customer2.openAccount(123456L);
            if (!customer2.addMoneyToCurrentAccount(-100)) System.out.println("Successful test 2");
        }

        public void test_3()
        {
        // test 3 delete null account
        Customer customer3 = new Customer("Ivan", "Ivanov");
        if(!customer3.closeAccount()) System.out.println("Successful test 3");
        }

        public void test_4()
        {
            // test 4 - OK
            Customer customer4 = new Customer("Ivan", "Ivanov");
            customer4.openAccount(123456L);
            customer4.closeAccount();
            customer4.openAccount(123L);
            customer4.addMoneyToCurrentAccount(1000L);
            if (customer4.withdrawFromCurrentAccount(100)) System.out.println("Successful test 4");
        }

        /*
        @Test
        public void itShouldThrowNullPointerExceptionWhenBlahBlah() {
            assertThrows(NullPointerException.class,
                    ()->{
                        System.out.println("wrong");
                        //ex : objectName.thisMethodShoulThrowNullPointerExceptionForNullParameter(null);
                    });
        }
        // I tried this, but have an exeption java: package org.junit.jupiter.api does not exist and can not fix the problem
        */

    }

    public static void main(String[] args) {
        Customer.Test test = new Customer.Test();
        test.test_1();
        test.test_3();
        test.test_4();
    }
    /**
     * Opens account for a customer (creates Account and sets it to field "account").
     * Customer can't have greater than one opened account.
     *
     * @param accountId id of the account
     * @return true if account hasn't already created, otherwise returns false and prints "Customer fullName() already has the active account"
     */
    public boolean openAccount(long accountId) {
        // write your code here

        if(account == null){
            account = new Account(accountId);
            return true;
        }
        else{
            System.out.println("Customer " + fullName() + " already has the active account");
            return false;
        }
    }

    /**
     * Closes account. Sets account to null.
     *
     * @return false if account is already null and prints "Customer fullName() has no active account to close", otherwise sets account to null and returns true
     */
    public boolean closeAccount() {
        // write your code here

        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account to close");
            return false;
        }
        else{
            account = null;
            return false;
        }
    }

    /**
     * Formatted full name of the customer
     * @return concatenated form of name and lastName, e.g. "John Goodman"
     */
    public String fullName() {
        // write your code here
        return name + " " + lastName;
    }

    /**
     * Delegates withdraw to Account class
     * @param amount
     * @return false if account is null and prints "Customer fullName() has no active account", otherwise returns the result of Account's withdraw method
     */
    public boolean withdrawFromCurrentAccount(double amount) {
        // write your code here

        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account");
            return false;
        }
        else{
            account.withdraw(amount);
            return account.withdraw(amount);
        }
    }

    /**
     * Delegates adding money to Account class
     * @param amount
     * @return false if account is null and prints "Customer fullName() has no active account", otherwise returns the result of Account's add method
     */
    public boolean addMoneyToCurrentAccount(double amount) {
        // write your code here
        if(account == null){
            System.out.println("Customer " + fullName() + " has no active account");
            return false;
        }
        else{
            account.add(amount);
            return account.add(amount);
        }
    }
}
