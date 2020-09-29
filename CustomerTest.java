package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    boolean try_to_open_2_accounts_if_it_fails_return_true() {
        // given
        Customer customer = new Customer("ivan", "petrov");
        customer.openAccount(123L);
        //when
        boolean isSucesess = !customer.openAccount(12345L);
        //then
        assertTrue(isSucesess);
        return true;
    }

    @Test
    boolean open_1_account_if_sucesess_return_true() {
        // given
        Customer customer = new Customer("ivan", "petrov");
        //when
        boolean isSucesess = customer.openAccount(1234L);
        //then
        assertTrue(isSucesess);
        return true;
    }

    @Test
    boolean try_to_close_myth_account_if_cannot_return_true() {
        // given
        Customer customer = new Customer("ivan", "petrov");
        //when
        boolean isSucesess = !customer.closeAccount();
        //then
        assertTrue(isSucesess);
        return true;

    }

    @Test
    boolean try_to_withdraw_money_from_empty_account_if_cannot_return_true() {
        // given
        Customer customer = new Customer("ivan", "petrov");
        customer.openAccount(112233);
        //when
        boolean isSucesess = !customer.withdrawFromCurrentAccount(1_000);
        //then
        assertTrue(isSucesess);
        return true;
    }

    @Test
    boolean try_to_addMoney_to_myth_account_if_cannot_return_true() {
        // given
        Customer customer = new Customer("ivan", "petrov");
        //when
        boolean isSucesess = !customer.addMoneyToCurrentAccount(1_000);
        //then
        assertTrue(isSucesess);
        return true;
    }
}