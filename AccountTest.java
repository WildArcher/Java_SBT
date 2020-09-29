package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {

    @Test
    boolean try_to_withdraw_more_money_then_have_if_cannot_return_true() {
        // given
        Account account = new Account(123);
        // when
        boolean isSuccess = !account.withdraw(10);
        // then
        assertTrue(isSuccess);
        return true;
    }

    @Test
    boolean name() {
        return true;
    }
}