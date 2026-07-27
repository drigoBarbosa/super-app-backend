package com.drigobarbosa.superapp.financial.support.factory;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.enums.AccountType;

import java.math.BigDecimal;

public class AccountFactory {

    public static Account.AccountBuilder cashInHand() {
        return Account.builder()
                .name("Dinheiro em mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .active(true);
    }

}
