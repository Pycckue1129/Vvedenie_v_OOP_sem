package org.example.Sem6.Cw3;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private NewClass account;

    public BankingAppWithdrawalService(NewClass account) {
        this.account = account;
    }

    public void withdraw(float amount){
        account.withdraw(amount);
    }
}
