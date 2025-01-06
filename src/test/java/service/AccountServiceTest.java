package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void testWithdrawInsufficientFunds() {
        double depositAmount = 50.0;
        double withdrawAmount = 100.0;

        accountService.deposit(depositAmount);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> accountService.withdraw(withdrawAmount));

        assertEquals("Insufficient funds", exception.getMessage(), "Expected exception for insufficient funds.");
    }

    @Test
    void testDepositAmountZeroOrNegative() {
        // Given
        double zeroAmount = 0.0;
        double negativeAmount = -50.0;

        IllegalArgumentException zeroDepositException = assertThrows(IllegalArgumentException.class, () -> accountService.deposit(zeroAmount));

        IllegalArgumentException negativeDepositException = assertThrows(IllegalArgumentException.class, () -> accountService.deposit(negativeAmount));

        // Then: Assert the exception messages
        assertEquals("Deposit amount must be positive and greater than zero.", zeroDepositException.getMessage(), "Expected exception for zero deposit.");
        assertEquals("Deposit amount must be positive and greater than zero.", negativeDepositException.getMessage(), "Expected exception for negative deposit.");
    }


    @Test
    void testWithdrawAmountZeroOrNegative() {
        double zeroAmount = 0.0;
        double negativeAmount = -50.0;

        IllegalArgumentException zeroWithdrawException = assertThrows(IllegalArgumentException.class, () -> accountService.withdraw(zeroAmount));

        IllegalArgumentException negativeWithdrawException = assertThrows(IllegalArgumentException.class, () -> accountService.withdraw(negativeAmount));

        // Then: Assert the exception messages
        assertEquals("Withdrawal amount must be positive and greater than zero.", zeroWithdrawException.getMessage(), "Expected exception for zero withdrawal.");
        assertEquals("Withdrawal amount must be positive and greater than zero.", negativeWithdrawException.getMessage(), "Expected exception for negative withdrawal.");
    }


    @Test
    void testPrintStatement() {
        accountService.deposit(100.0);
        accountService.withdraw(25.0);

        accountService.printStatement();
    }

    @Test
    void testGetBalance() {
        double depositAmount = 500.0;

        accountService.deposit(depositAmount);

        assertEquals(500.0, accountService.getBalance(), "Balance should be 500.");
    }

}
