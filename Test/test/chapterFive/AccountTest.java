package chapterFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AccountTest {

    @Test
    @DisplayName("Test to enter account number")
    void account_canSetAccountNumber(){
        Account myAccount = new Account();
        myAccount.setAccountNumber("1001432165");
        assertEquals("1001432165", myAccount.getAccountNumber());
    }

    @Test
    @DisplayName("Test that invalid account number can be entered")
    void account_cantSetInvalidAccountNumber(){
        Account myAccount = new Account();
        myAccount.setAccountNumber("1001432165783");
        assertNull(myAccount.getAccountNumber());
        myAccount.setAccountNumber("10014321");
        assertNull(myAccount.getAccountNumber());
    }

    @Test
    @DisplayName("Test to enter a pin")
        void account_canSetPin() {
        Account myAccount = new Account();
        myAccount.setPin("1111");
        assertEquals("1111", myAccount.getPin());
    }

    @Test
    @DisplayName("Test that invalid pin can't be entered")
    void account_cantSetInvalidPin(){
        Account myAccount = new Account();
        myAccount.setPin("87654");
        assertNull(myAccount.getPin());
    }

    @Test
    @DisplayName("Test to deposit")
    void account_canReceiveDeposit(){
        Account myAccount = new Account();
        myAccount.deposit(90.00);
        assertEquals(90, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative amount can't be deposited")
    void account_cantReceiveNegativeDeposit(){
        Account myAccount = new Account();
        myAccount.deposit(-90.00);
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to deposit several times")
    void account_canReceiveDepositSeverally(){
        Account myAccount = new Account();
        myAccount.deposit(90.00);
        myAccount.deposit(89.00);
        myAccount.deposit(67.00);
        assertEquals(246, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to withdraw")
    void account_canWithdraw(){
        Account myAccount = new Account();
        myAccount.deposit(9000);
        myAccount.setPin("1111");
        myAccount.withdraw(1234, "1111");
        assertEquals(7766, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative amount cant be withdrawn")
    void account_cantWithdrawNegativeAmount(){
        Account myAccount = new Account();
        myAccount.deposit(3000);
        myAccount.setPin("1111");
        myAccount.withdraw(-760, "1111");
        assertEquals(3000, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test that amount greater than amount cant be withdrawn")
    void account_cantWithdrawAmountLargerThanBalance(){
        Account myAccount = new Account();
        myAccount.deposit(6789);
        myAccount.setPin("1111");
        myAccount.withdraw(90000, "1111");
        assertEquals(6789, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to withdraw multiple times")
    void account_canWithdrawSeverally(){
        Account myAccount = new Account();
        myAccount.deposit(9000);
        myAccount.setPin("1111");
        myAccount.withdraw(1234, "1111");
        myAccount.withdraw(567, "1111");
        myAccount.withdraw(45, "1111");
        assertEquals(7154, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to check balance")
    void account_canCheckBalance(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.checkBalance());
    }

    @Test
    @DisplayName("Test to transfer")
    void account_canTransfer(){
        Account myAccount = new Account();
        myAccount.deposit(40000);
        myAccount.setPin("1111");
        myAccount.transfer(3000, "1111");
        assertEquals(37000, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to recharge")
    void account_canRecharge(){
        Account myAccount = new Account();
        myAccount.deposit(40000);
        myAccount.setPin("1111");
        myAccount.recharge(3000, "1111");
        assertEquals(37000, myAccount.getBalance());
    }

    @Test
    @DisplayName("Test to pay bills")
    void account_canPayBills(){
        Account myAccount = new Account();
        myAccount.deposit(40000);
        myAccount.setPin("1111");
        myAccount.makePayment(3000, "1111");
        assertEquals(37000, myAccount.getBalance());
    }
}
