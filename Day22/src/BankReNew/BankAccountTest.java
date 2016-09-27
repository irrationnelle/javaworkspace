package BankReNew;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testBankAccount() {
		BankAccount ac = new BankAccount("rase", 1234, 100);
		assertEquals("rase", ac._name);
		assertEquals(1234, ac._password);
		assertEquals(100, ac._amount);
		assertEquals(1001,ac._accountNum);
		
		TotalFrame.bankAccount.add(new BankAccount("rase", 1234, 100));
		assertEquals("rase", TotalFrame.bankAccount.get(0)._name);
		
	}

}
