package CustomizedException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InsufficientBalance {
        BigDecimal DEPOSIT_AMOUNT = BigDecimal.TEN.multiply(BigDecimal.TEN);

        Account account = new Account();
        account.deposit(BigDecimal.valueOf(100));
        account.withdraw(BigDecimal.TEN.multiply(BigDecimal.TEN));
    }
}
