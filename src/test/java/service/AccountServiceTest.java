package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    void setUp() {
        accountService = new AccountService();
    }

    @Test
    void testDeposit() {
        double depositAmount = 100.0;

        accountService.deposit(depositAmount);

        assertEquals(100.0, accountService.getBalance(), "Balance after deposit should be 100.");
    }

}
