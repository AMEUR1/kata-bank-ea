package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


    @Test
    void testWithdraw() {
        double depositAmount = 200.0;
        double withdrawAmount = 100.0;

        accountService.deposit(depositAmount);

        accountService.withdraw(withdrawAmount);

        assertEquals(100.0, accountService.getBalance(), "Balance after withdrawal should be 100.");
    }

    @Test
    void testPrintStatement() {
        accountService.deposit(100.0);
        accountService.withdraw(25.0);

        accountService.printStatement();
    }

}
