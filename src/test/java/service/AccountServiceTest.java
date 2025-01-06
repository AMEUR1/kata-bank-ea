package service;

import org.junit.jupiter.api.Test;

public class AccountServiceTest {

    @Test
    void testDeposit() {
        double depositAmount = 100.0;

        accountService.deposit(depositAmount);

        assertEquals(100.0, accountService.getBalance(), "Balance after deposit should be 100.");
    }

}
