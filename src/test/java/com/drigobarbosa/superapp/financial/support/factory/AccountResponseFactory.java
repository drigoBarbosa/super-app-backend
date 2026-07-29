package com.drigobarbosa.superapp.financial.support.factory;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.response.AccountResponse;

import java.math.BigDecimal;

public class AccountResponseFactory {

    public static AccountResponse cashInHand() {
        return AccountResponse
                .builder()
                .name("Dinheiro em Mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .active(true)
                .build();
    }

}
