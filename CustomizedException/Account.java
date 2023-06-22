package CustomizedException;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Account {

    private BigDecimal balance = BigDecimal.ZERO;

    public void deposit(BigDecimal amountToDeposit) {
        balance = balance.add(amountToDeposit);
    }

    public void withdraw(BigDecimal amountToWithdraw) throws InsufficientBalance {
        if (amountToWithdraw.compareTo(balance) > BigInteger.ZERO.intValue())
            throw new InsufficientBalance("Ole ni e");

    }
}
